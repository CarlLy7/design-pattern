package com.geek.designpattern.visitorPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: carl
 * @date: 2025.02.24
 */

public class Solution {
    public static void main(String[] args) {
        List<ResourceFile> resourceFiles = listAllResourceFiles();
        //文字提取
        Extractor extractor = new Extractor();
        for (ResourceFile resourceFile : resourceFiles) {
            resourceFile.accept(extractor);
        }
        //文件压缩
        Compressor compressor = new Compressor();
        for (ResourceFile resourceFile : resourceFiles) {
            resourceFile.accept(compressor);
        }
    }

    private static List<ResourceFile> listAllResourceFiles(){
        List<ResourceFile> resourceFiles=new ArrayList<>();
        resourceFiles.add(new PdfFile("a.pdf"));
        resourceFiles.add(new PptFile("b.ppt"));
        resourceFiles.add(new WordFile("c.word"));
        return resourceFiles;
    }
}
