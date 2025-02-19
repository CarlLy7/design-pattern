package com.geek.designpattern.strategyPattern;

/**
 * 根据不同类型获取不同策略的策略工厂
 * @author: carl
 * @date: 2025.02.19
 */

public class StrategyFactory {
    public static Strategy getStrategy(String type) {
        if (type.isBlank() || type == null) {
            throw new IllegalArgumentException("type is not empty");
        }
        if ("A".equals(type)) {
            return new StrategyA();
        } else if ("B".equals(type)) {
            return new StrategyB();
        }
        return null;
    }
}
