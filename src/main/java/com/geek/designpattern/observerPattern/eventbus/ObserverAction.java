package com.geek.designpattern.observerPattern.eventbus;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 用来表示@Subscribe注解的方法，注册到ObServerRegister中的实体
 *
 * @author: carl
 * @date: 2025.02.13
 */

public class ObserverAction {
    //观察者类
    private Object target;

    // 标注了@Subscribe注解的方法
    private Method method;

    public ObserverAction(Object target, Method method) {
        this.target = target;
        this.method = method;
        // 私有方法也可以被调用
        this.method.setAccessible(true);
    }

    /**
     * @param event：method方法的参数
     */
    public void execute(Object event) {
        try {
            method.invoke(target, event);
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
