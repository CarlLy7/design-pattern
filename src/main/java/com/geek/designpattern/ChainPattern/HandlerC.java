package com.geek.designpattern.ChainPattern;

/**
 * @author: carl
 * @date: 2025.02.17
 */

public class HandlerC extends Handler{
    @Override
    public boolean doHandle() {
        System.out.println("Handler C");
        return true;
    }
}
