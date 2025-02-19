package com.geek.designpattern.adapterPattern.objectAdaptor;

/**
 * @author: carl
 * @date: 2025.02.19
 */

public class solution {
    public static void main(String[] args) {
        Adaptor adaptor = new Adaptor(new Adaptee());
        adaptor.f1();
        adaptor.f2();
        adaptor.fc();
    }
}
