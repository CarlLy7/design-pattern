package com.geek.designpattern.strategyPattern;

/**
 * 定义支付策略接口
 * @author: carl
 * @date: 2025.02.19
 */

public interface PaymentStrategy {
    void pay(double price);
}
