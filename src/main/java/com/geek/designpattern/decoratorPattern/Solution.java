package com.geek.designpattern.decoratorPattern;

/**
 * @author: carl
 * @date: 2025.02.19
 */

public class Solution {
    public static void main(String[] args) {
        CostaCoffee costaCoffee = new CostaCoffee();
        System.out.println("描述: "+costaCoffee.getDesc()+" 价格为： "+costaCoffee.getPrice());
        //功能增强装饰器类
        MilkDecorator milkDecorator = new MilkDecorator(costaCoffee);
        System.out.println("增强之后，描述: "+milkDecorator.getDesc()+" 价格为： "+milkDecorator.getPrice());
    }
}
