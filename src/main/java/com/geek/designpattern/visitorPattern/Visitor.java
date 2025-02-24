package com.geek.designpattern.visitorPattern;

/**
 * 访问者接口
 * @author: carl
 * @date: 2025.02.24
 */
public interface Visitor {
    void visitor(PdfFile pdfFile);
    void visitor(PptFile pptFile);
    void visitor(WordFile wordFile);

}
