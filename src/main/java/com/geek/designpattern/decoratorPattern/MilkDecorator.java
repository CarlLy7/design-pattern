package com.geek.designpattern.decoratorPattern;

/**
 * 对原始的咖啡接口进行功能增强，原有的逻辑保持不变，然后在原有的功能基础上进行增强
 *
 * @author: carl
 * @date: 2025.02.19
 */

public class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    //在原始方法上进行增强
    @Override
    public String getDesc() {
        return super.getDesc() + "加牛奶";
    }

    //在原始方法上进行增强
    @Override
    public double getPrice() {
        return super.getPrice() + 0.5;
    }
}
