package com.geek.designpattern.singletonPattern;

import java.util.concurrent.atomic.AtomicLong;

/**
 * 使用静态内部类实现单例模式
 *
 * @author: carl
 * @date: 2025.02.14
 */

public class IdGenerator {
    private AtomicLong id = new AtomicLong(0);

    //静态内部类
    private static class SingletonHodler {
        private static final IdGenerator instance = new IdGenerator();
    }

    public static IdGenerator getInstance() {
        return SingletonHodler.instance;
    }

    public long getId() {
        return id.incrementAndGet();
    }
}
