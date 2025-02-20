package com.geek.designpattern.iteratorPattern;

/**
 * 迭代器接口
 *
 * @author: carl
 * @date: 2025.02.20
 */
public interface Iterator<E> {
    boolean hasNext();

    void next();

    E currentItem();
}
