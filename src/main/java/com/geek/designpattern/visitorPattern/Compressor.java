package com.geek.designpattern.visitorPattern;

/**
 * 文件压缩类，实现访问者接口
 *
 * @author: carl
 * @date: 2025.02.24
 */

public class Compressor implements Visitor {
    @Override
    public void visitor(PdfFile pdfFile) {
        System.out.println("pdf文件压缩");
    }

    @Override
    public void visitor(PptFile pptFile) {
        System.out.println("ppt文件压缩");
    }

    @Override
    public void visitor(WordFile wordFile) {
        System.out.println("word文件压缩");
    }
}
