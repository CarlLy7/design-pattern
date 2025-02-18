package com.geek.designpattern.bridgingPattern;

/**
 * 消息发送的具体实现-电话发送
 * @author: carl
 * @date: 2025.02.18
 */

public class TelephoneSender implements MsgSender{
    @Override
    public void send(String message) {
        System.out.println("手机发送消息....");
    }
}
