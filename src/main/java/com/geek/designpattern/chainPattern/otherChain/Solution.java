package com.geek.designpattern.chainPattern.otherChain;

/**
 * @author: carl
 * @date: 2025.02.26
 */

public class Solution {
    public static void main(String[] args) {
        HandlerChain handlerChain = new HandlerChain();
        handlerChain.addHandler(new HandlerB());
        handlerChain.addHandler(new HandlerA());
        handlerChain.doHandle();
    }
}
