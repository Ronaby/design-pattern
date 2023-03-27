package com.ronbay.desigin.module.vistor.demo01;

/**
 * @Description: 从pdf中提取文本内容
 * @Author
 * @Date 2023/3/27
 * @Version 1.0
 */
public class PdfFile extends ResourceFile{

    public PdfFile(String filePath) {
        super(filePath);
    }

    @Override
    public void extract2Txt() {
        //从pdf中提取文本内容逻辑省掉
        System.out.println("从pdf中提取文本内容");
    }
}
