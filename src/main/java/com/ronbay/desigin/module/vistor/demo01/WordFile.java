package com.ronbay.desigin.module.vistor.demo01;

/**
 * @Description: word提取文件
 * @Author
 * @Date 2023/3/27
 * @Version 1.0
 */
public class WordFile extends ResourceFile {

    public WordFile(String filePath) {
        super(filePath);
    }

    @Override
    public void extract2Txt() {
        // 省略从word提取文本内容的方法
        System.out.println("省略从word提取文本内容的方法");
    }
}
