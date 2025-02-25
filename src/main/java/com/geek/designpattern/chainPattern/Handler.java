package com.geek.designpattern.chainPattern;

/**
 * 职责链中处理器的抽象父类
 *
 * @author: carl
 * @date: 2025.02.17
 */

public abstract class Handler {
    protected Handler successor = null;

    public void setSuccessor(Handler handler) {
        this.successor = handler;
    }

    // 使用final修饰，防止被子类重写
    // 一个请求会被链路中的所有处理器进行处理
    public final void handle() {
        boolean isHandle=doHandle();
        while (successor != null  && isHandle) {
            this.successor.handle();
        }
    }

    public abstract boolean doHandle();
}
