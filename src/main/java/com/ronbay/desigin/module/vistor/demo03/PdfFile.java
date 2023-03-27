package com.ronbay.desigin.module.vistor.demo03;


/**
 * @Description:
 * @Author
 * @Date 2023/3/27
 * @Version 1.0
 */
public class PdfFile extends ResourceFile {
    public PdfFile(String filePath) {
        super(filePath);
    }


    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
