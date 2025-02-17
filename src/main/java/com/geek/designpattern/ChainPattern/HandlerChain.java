package com.geek.designpattern.ChainPattern;

/**
 * 职责链模式中的职责链
 *
 * @author: carl
 * @date: 2025.02.17
 */

public class HandlerChain {
    private Handler head = null;
    private Handler tail = null;

    public HandlerChain() {
    }

    public HandlerChain(Handler head, Handler tail) {
        this.head = head;
        this.tail = tail;
    }


    public Handler getHead() {
        return head;
    }

    public void setHead(Handler head) {
        this.head = head;
    }

    public Handler getTail() {
        return tail;
    }

    public void setTail(Handler tail) {
        this.tail = tail;
    }

    public void addHandler(Handler handler) {
        handler.setSuccessor(null);
        if (head == null) {
            head = handler;
            tail = handler;
            return;
        }
        tail.setSuccessor(handler);
        tail = handler;
    }

    public void handle() {
        if (head != null) {
            head.handle();
        }
    }

    @Override
    public String toString() {
        return "HandlerChain{" +
                "head=" + head +
                ", tail=" + tail +
                '}';
    }
}
