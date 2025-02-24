package com.geek.designpattern.visitorPattern;

/**
 * pdf文件具体实现类
 * @author: carl
 * @date: 2025.02.24
 */

public class PdfFile extends ResourceFile {
    public PdfFile(String filePath) {
        super(filePath);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitor(this);
    }
}
