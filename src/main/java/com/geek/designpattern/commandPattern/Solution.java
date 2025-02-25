package com.geek.designpattern.commandPattern;

/**
 * @author: carl
 * @date: 2025.02.25
 */

public class Solution {
    public static void main(String[] args) {
        Light light = new Light();
        RemoteController remoteController = new RemoteController();
        remoteController.setCommand(new LightOnCommand(light));
        remoteController.pressButton();
        remoteController.setCommand(new LightOffCommand(light));
        remoteController.pressButton();
    }
}
