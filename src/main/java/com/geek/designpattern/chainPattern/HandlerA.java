package com.geek.designpattern.chainPattern;

/**
 * @author: carl
 * @date: 2025.02.17
 */

public class HandlerA extends Handler{
    @Override
    public boolean doHandle() {
        System.out.println("Handler A");
        return true;
    }
}
