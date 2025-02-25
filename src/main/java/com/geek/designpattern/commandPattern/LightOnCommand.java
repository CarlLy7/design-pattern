package com.geek.designpattern.commandPattern;

/**
 * 具体命令，命令实现者
 * @author: carl
 * @date: 2025.02.25
 */

public class LightOnCommand implements Command{
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }
}
