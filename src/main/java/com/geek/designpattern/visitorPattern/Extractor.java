package com.geek.designpattern.visitorPattern;

/**
 * 文字提取类，实现访问者接口
 * @author: carl
 * @date: 2025.02.24
 */

public class Extractor implements Visitor {
    @Override
    public void visitor(PdfFile pdfFile) {
        System.out.println("pdf文件文字提取");
    }

    @Override
    public void visitor(PptFile pptFile) {
        System.out.println("ppt文件文字提取");
    }

    @Override
    public void visitor(WordFile wordFile) {
        System.out.println("word文件文字提取");
    }
}
