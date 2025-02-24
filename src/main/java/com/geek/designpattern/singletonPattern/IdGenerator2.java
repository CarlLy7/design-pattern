package com.geek.designpattern.singletonPattern;

import java.util.concurrent.atomic.AtomicLong;

/**
 * 使用枚举实现单例模式
 *
 * @author: carl
 * @date: 2025.02.14
 */
public enum IdGenerator2 {
    INSTANCE;
    private AtomicLong id = new AtomicLong(0);

    public long getId() {
        return id.incrementAndGet();
    }
}
