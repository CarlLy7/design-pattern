package com.geek.designpattern.bridgingPattern;

/**
 * 通知类的具体实现-正常通知
 *
 * @author: carl
 * @date: 2025.02.18
 */

public class NormalNotification extends Notification {

    public NormalNotification(MsgSender msgSender) {
        super(msgSender);
    }

    @Override
    public void send(String message) {
        //调用上层具体消息发送的发送方法
        msgSender.send(message);
    }
}
