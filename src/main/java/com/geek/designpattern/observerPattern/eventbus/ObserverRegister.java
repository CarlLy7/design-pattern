package com.geek.designpattern.observerPattern.eventbus;

import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * 观察者注册表，主要是将各个观察者上可以被调用的函数注册上去
 *
 * @author: carl
 * @date: 2025.02.13
 */

public class ObserverRegister {
    // 映射关系： 观察者类： 暴漏的方法列表
    private ConcurrentMap<Class<?>, CopyOnWriteArraySet<ObserverAction>> registry = new ConcurrentHashMap<>();

    /**
     * 根据项目中的@Subscribe注解来进行注册
     *
     * @param obServer
     */
    public void register(Object obServer) {
        //根据观察者将该观察者所有暴露的方法注册到注册表中
        Map<Class<?>, Collection<ObserverAction>> observers = findAllObServerActions(obServer);
        for (Map.Entry<Class<?>, Collection<ObserverAction>> entry : observers.entrySet()) {
            Class<?> observer = entry.getKey();
            Collection<ObserverAction> methods = entry.getValue();
            CopyOnWriteArraySet<ObserverAction> observerActions = registry.get(observer);
            if (observerActions == null) {
                registry.putIfAbsent(observer, new CopyOnWriteArraySet<>());
            }
            registry.get(observer).addAll(methods);
        }
    }

    private Map<Class<?>, Collection<ObserverAction>> findAllObServerActions(Object obServer) {
        Map<Class<?>, Collection<ObserverAction>> result = new HashMap<>();
        Class<?> clazz = obServer.getClass();
        for (Method method : getAnnotatedMethods(clazz)) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            Class<?> eventType = parameterTypes[0];
            if (!result.containsKey(eventType)) {
                result.put(eventType, new ArrayList<>());
            }
            result.get(eventType).add(new ObserverAction(obServer, method));
        }
        return result;
    }

    private List<Method> getAnnotatedMethods(Class<?> clazz) {
        List<Method> result = new ArrayList<>();
        for (Method method : clazz.getDeclaredMethods()) {
            if (method.isAnnotationPresent(Subscribe.class)) {
                result.add(method);
            }
        }
        return result;
    }

    /**
     * 根据参数获取所有匹配的方法
     *
     * @param event
     * @return
     */
    public List<ObserverAction> getMatchedObserverActions(Object event) {
        List<ObserverAction> result = new ArrayList<>();
        Class<?> eventClass = event.getClass();
        for (Map.Entry<Class<?>, CopyOnWriteArraySet<ObserverAction>> entry : registry.entrySet()) {
            Class<?> key = entry.getKey();
            if (eventClass.isAssignableFrom(key)) {
                result.addAll(entry.getValue());
            }
        }
        return result;
    }

}
