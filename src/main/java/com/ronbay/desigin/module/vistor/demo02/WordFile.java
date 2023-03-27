package com.ronbay.desigin.module.vistor.demo02;

/**
 * @Description:
 * @Author
 * @Date 2023/3/27
 * @Version 1.0
 */
public class WordFile extends ResourceFile{

    public WordFile(String filePath) {
        super(filePath);
    }

    @Override
    public void accept(ExtractFile extractFile) {
        extractFile.extract2txt(this);
    }
}
