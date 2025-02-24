package com.geek.designpattern.visitorPattern;

/**
 * word文件具体实现类
 * @author: carl
 * @date: 2025.02.24
 */

public class WordFile extends ResourceFile{

    public WordFile(String filePath) {
        super(filePath);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitor(this);
    }
}
