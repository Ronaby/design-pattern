package com.ronbay.desigin.module.vistor.demo03;


/**
 * @Description: 提取文本文件内容
 * @Author
 * @Date 2023/3/27
 * @Version 1.0
 */
public class Extractor implements Visitor {
    @Override
    public void visit(PPTFile pptFile) {
        System.out.println("PPT提取文本内容");
    }

    @Override
    public void visit(WordFile wordFile) {
        System.out.println("word提取文本内容");
    }

    @Override
    public void visit(PdfFile pdfFile) {
        System.out.println("pdf提取文本内容");
    }
}
