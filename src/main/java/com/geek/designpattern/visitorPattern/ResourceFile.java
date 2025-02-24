package com.geek.designpattern.visitorPattern;

/**
 * 原文件抽象类
 * @author: carl
 * @date: 2025.02.24
 */

public abstract class ResourceFile {
    protected String filePath;

    public ResourceFile(String filePath) {
        this.filePath = filePath;
    }

    public abstract void accept(Visitor visitor);
}
