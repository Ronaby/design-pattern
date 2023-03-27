package com.ronbay.desigin.module.vistor.demo03;


/**
 * @Description: 具体业务接口
 * @Author
 * @Date 2023/3/27
 * @Version 1.0
 */
public interface Visitor {
    void visit(PPTFile pptFile);

    void visit(WordFile wordFile);

    void visit(PdfFile pdfFile);

}
