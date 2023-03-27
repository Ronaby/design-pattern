package com.ronbay.desigin.module.vistor.demo01;

/**
 * @Description: 访问者模式-抽象类，从文件中抽取文本内容
 * @Author
 * @Date 2023/3/27
 * @Version 1.0
 */
public abstract class ResourceFile {
    private String filePath;

    public ResourceFile(String filePath){
        this.filePath = filePath;
    }

    public abstract void extract2Txt();
}
