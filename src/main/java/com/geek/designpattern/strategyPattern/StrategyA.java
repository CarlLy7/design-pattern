package com.geek.designpattern.strategyPattern;

/**
 * 策略实现
 *
 * @author: carl
 * @date: 2025.02.19
 */

public class StrategyA implements Strategy {
    @Override
    public void algorithm() {
        System.out.println("strategyA...");
    }
}
