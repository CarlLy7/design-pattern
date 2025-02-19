package com.geek.designpattern.strategyPattern;

/**
 * 策略上下文类
 *
 * @author: carl
 * @date: 2025.02.19
 */

public class StrategyContext {
    //使用组合来依赖策略类
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void executePay(double price) {
        if (paymentStrategy == null) {
            throw new IllegalArgumentException("paymentStrategy is not empty.");
        }
        paymentStrategy.pay(price);
    }
}
