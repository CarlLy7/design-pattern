package com.geek.designpattern.visitorPattern;

/**
 * ppt文件具体实现类
 * @author: carl
 * @date: 2025.02.24
 */

public class PptFile extends ResourceFile{
    public PptFile(String filePath) {
        super(filePath);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitor(this);
    }
}
