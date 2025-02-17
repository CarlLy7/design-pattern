package com.geek.designpattern.observerPattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: carl
 * @date: 2025.02.13
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;
    private List<RegObserver> observers = new ArrayList<>();

    // 在被观察者中注册所有的观察者
    public void setObservers(List<RegObserver> observers) {
        observers.addAll(observers);
    }


    public Long register(String telephone, String password) {
        long userId = userService.register();
        // 同步阻塞观察者模式，必须等待被观察者上所有的观察者都执行完注册成功的逻辑后才可以得到返回结果
        for (RegObserver observer : observers) {
            observer.handleRegSuccess(userId);
        }
        return userId;
    }
}
