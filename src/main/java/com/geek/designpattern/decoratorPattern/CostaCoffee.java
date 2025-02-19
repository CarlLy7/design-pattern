package com.geek.designpattern.decoratorPattern;

/**
 * 具体咖啡实现者
 *
 * @author: carl
 * @date: 2025.02.19
 */

public class CostaCoffee implements Coffee {
    @Override
    public String getDesc() {
        return "Costa咖啡，源自英国";
    }

    @Override
    public double getPrice() {
        return 10.5;
    }
}
