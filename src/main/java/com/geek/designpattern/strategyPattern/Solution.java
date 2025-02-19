package com.geek.designpattern.strategyPattern;

/**
 * 客户端
 *
 * @author: carl
 * @date: 2025.02.19
 */

public class Solution {
    public static void main(String[] args) {
        StrategyContext strategyContext = new StrategyContext();
        creditCardPayment creditCardPayment = new creditCardPayment();
        creditCardPayment.setCardNo("1100005799");
        creditCardPayment.setName("carl");
        strategyContext.setPaymentStrategy(creditCardPayment);
        strategyContext.executePay(111.1);
        System.out.println();
        alipayPayment alipayPayment = new alipayPayment();
        alipayPayment.setCardNo("1100005799");
        alipayPayment.setName("carl-Alipay");
        strategyContext.setPaymentStrategy(alipayPayment);
        strategyContext.executePay(666.6);
        System.out.println();
    }
}
