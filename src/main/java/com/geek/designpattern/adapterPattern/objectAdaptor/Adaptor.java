package com.geek.designpattern.adapterPattern.objectAdaptor;

import com.geek.designpattern.adapterPattern.classAdapter.ITarget;

/**
 * 对象适配器类
 * 对象适配器模式一般通过<b>组合</b> 方式来实现
 *
 * @author: carl
 * @date: 2025.02.19
 */

public class Adaptor implements ITarget {
    private Adaptee adaptee;

    public Adaptor(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void f1() {
        adaptee.fa();
    }

    @Override
    public void f2() {
        adaptee.fb();
    }

    @Override
    public void fc() {
        adaptee.fc();
    }
}
