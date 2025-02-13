package com.geek.designpattern.observerPattern;

import org.springframework.stereotype.Service;

/**
 * 观察者具体实现-注册成功后发送站内消息
 * @author: carl
 * @date: 2025.02.13
 */
@Service
public class RegNotificationObserver implements RegObserver{
    @Override
    public void handleRegSuccess(long userId) {
        System.out.println("发送站内消息");
    }
}
