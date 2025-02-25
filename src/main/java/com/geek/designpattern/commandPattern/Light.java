package com.geek.designpattern.commandPattern;

/**
 * 接收者，实际去执行命令的对象
 * @author: carl
 * @date: 2025.02.25
 */

public class Light {
    public void turnOn(){
        System.out.println("开灯！！");
    }

    public void turnOff(){
        System.out.println("关灯！！");
    }
}
