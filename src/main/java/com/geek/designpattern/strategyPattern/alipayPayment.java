package com.geek.designpattern.strategyPattern;

/**
 * @author: carl
 * @date: 2025.02.19
 */

public class alipayPayment implements PaymentStrategy{
    private String name;
    private String cardNo;

    public alipayPayment() {
    }

    public alipayPayment(String name, String cardNo) {
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
        System.out.printf("%s,使用AliPay,卡号%s,支付了,%.2f$ \n", name, cardNo, price);
    }
}
