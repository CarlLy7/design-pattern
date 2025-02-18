package com.geek.designpattern.bridgingPattern;

/**
 * 消息发送的具体实现-邮件发送
 * @author: carl
 * @date: 2025.02.18
 */

public class EmailSender implements MsgSender{
    @Override
    public void send(String message) {
        System.out.println("邮件发送....");
    }
}
