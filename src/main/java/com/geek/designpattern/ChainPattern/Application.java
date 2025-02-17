package com.geek.designpattern.ChainPattern;

/**
 * 职责链模式启动类
 *
 * @author: carl
 * @date: 2025.02.17
 */

public class Application {
    public static void main(String[] args) {
        HandlerChain chain = new HandlerChain();
        chain.addHandler(new HandlerA());
//        chain.addHandler(new HandlerB());
//        chain.addHandler(new HandlerC());
        chain.handle();
    }

}
