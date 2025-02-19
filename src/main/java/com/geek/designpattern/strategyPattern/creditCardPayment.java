package com.geek.designpattern.strategyPattern;

/**
 * 具体的支付策略
 * @author: carl
 * @date: 2025.02.19
 */

public class creditCardPayment implements PaymentStrategy {
    private String name;
    private String cardNo;

    public creditCardPayment() {
    }

    public creditCardPayment(String name, String cardNo) {
        this.name = name;
        this.cardNo = cardNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    @Override
    public void pay(double price) {
        System.out.printf("%s,使用信用卡,卡号%s,支付了,%.2f$ \n", name, cardNo, price);
    }
}
