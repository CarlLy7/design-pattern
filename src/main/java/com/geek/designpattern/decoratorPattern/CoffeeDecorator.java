package com.geek.designpattern.decoratorPattern;

/**
 * 咖啡装饰器基类
 * @author: carl
 * @date: 2025.02.19
 */

public abstract class CoffeeDecorator implements Coffee{
    protected Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDesc() {
        return coffee.getDesc();
    }

    @Override
    public double getPrice() {
        return coffee.getPrice();
    }
}
