package com.ronbay.desigin.module.vistor.demo01;

/**
 * @Description: 从ppt中抽取文本内容
 * @Author
 * @Date 2023/3/27
 * @Version 1.0
 */
public class PPTFile extends ResourceFile{
    public PPTFile(String filePath) {
        super(filePath);
    }

    @Override
    public void extract2Txt() {
        System.out.println("从ppt中抽取文本内容");
    }
}
