package com.geek.designpattern.chainPattern.otherChain;

/**
 * 具体职责链中的处理器
 * @author: carl
 * @date: 2025.02.26
 */

public class HandlerB implements IHandler{
    @Override
    public boolean handle() {
        System.out.println("处理器B处理完毕!!");
        return true;
    }
}
