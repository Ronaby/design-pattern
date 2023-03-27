package com.ronbay.desigin.module.vistor.demo02;

/**
 * @Description: 扩展类
 * @Author
 * @Date 2023/3/27
 * @Version 1.0
 */
public class ExtractFile {

    public void extract2txt(PPTFile pptFile){
        System.out.println("ppt文本提取");
    }

    public void extract2txt(WordFile wordFile){
        System.out.println("word文本提取");
    }

    public void extract2txt(PdfFile pdfFile){
        System.out.println("pdf提取文本内容");
    }
}
