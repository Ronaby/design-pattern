package com.ronbay.desigin.module.vistor.demo02;

/**
 * @Description: 访问者模式-抽象类
 * @Author
 * @Date 2023/3/27
 * @Version 1.0
 */
public abstract class ResourceFile {

    private String filePath;

    public ResourceFile(String filePath){
        this.filePath = filePath;
    }

    abstract public void  accept(ExtractFile extractFile);
}
