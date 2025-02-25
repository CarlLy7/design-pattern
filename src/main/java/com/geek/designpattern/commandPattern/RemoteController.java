package com.geek.designpattern.commandPattern;

/**
 * 控制器，触发命令的对象
 * @author: carl
 * @date: 2025.02.25
 */

public class RemoteController {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton(){
        command.execute();
    }
}
