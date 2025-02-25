package com.geek.designpattern.commandPattern;

/**
 * 命令具体实现者
 * @author: carl
 * @date: 2025.02.25
 */

public class LightOffCommand implements Command{
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}
