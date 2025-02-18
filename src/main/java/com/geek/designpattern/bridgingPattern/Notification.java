package com.geek.designpattern.bridgingPattern;

/**
 * 通知的抽象类
 * @author: carl
 * @date: 2025.02.18
 */

public abstract class Notification {
    //组合消息发送抽象接口
    protected MsgSender msgSender;

    public Notification(MsgSender msgSender) {
        this.msgSender = msgSender;
    }

    public abstract void send(String message);
}
