package com.geek.designpattern.statePattern;

/**
 * 状态枚举类
 * @author: carl
 * @date: 2025.02.20
 */
public enum State {
    SMALL(0,"small"),
    SUPER(1,"超级马里奥"),
    FIRED(2,"火焰马里奥"),
    CAPE(3,"斗篷马里奥");

    private int value;
    private String name;

    State(int value,String name) {
        this.value = value;
        this.name =name;
    }

    public int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }
}
