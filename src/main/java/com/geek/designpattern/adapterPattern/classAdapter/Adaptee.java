package com.geek.designpattern.adapterPattern.classAdapter;

/**
 * 需要将这个类适配到ITarget这个接
 * @author: carl
 * @date: 2025.02.19
 */

public class Adaptee {
    public void fa(){
        System.out.println("fa...");
    }

    public void fb(){
        System.out.println("fb...");
    }

    public void fc(){
        System.out.println("fc....");
    }
}
