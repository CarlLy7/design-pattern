package com.geek.designpattern.adapterPattern.classAdapter;

/**
 * 适配器，将类与类之间的接口进行适配
 * 类适配器主要是通过 <b>继承</b>来实现的适配
 *
 * @author: carl
 * @date: 2025.02.19
 */

public class Adaptor extends Adaptee implements ITarget {
    @Override
    public void f1() {
        super.fa();
    }

    @Override
    public void f2() {
        super.fb();
    }
}
