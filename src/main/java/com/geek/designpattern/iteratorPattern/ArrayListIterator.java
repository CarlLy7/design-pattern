package com.geek.designpattern.iteratorPattern;


import java.util.ArrayList;

/**
 * 迭代器的具体实现
 *
 * @author: carl
 * @date: 2025.02.20
 */

public class ArrayListIterator<E> implements Iterator<E> {
    private int cursor;
    private ArrayList<E> arrayList;

    public ArrayListIterator(ArrayList<E> arrayList) {
        this.cursor = 0;
        this.arrayList = arrayList;
    }

    @Override
    public boolean hasNext() {
        return cursor < arrayList.size() - 1;
    }

    @Override
    public void next() {
        this.cursor+=1;
    }

    @Override
    public E currentItem() {
        return arrayList.get(this.cursor);
    }
}
