package com.geek.designpattern.chainPattern.otherChain;

/**
 * 具体职责链中的处理器
 * @author: carl
 * @date: 2025.02.26
 */

public class HandlerA implements IHandler{
    @Override
    public boolean handle() {
        System.out.println("A处理器处理完毕....");
        return true;
    }
}
