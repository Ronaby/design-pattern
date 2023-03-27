package com.ronbay.desigin.module.vistor.demo02;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: ToolApplicationTEst
 * @Description:
 * @Author
 * @Date 2023/3/27
 * @Version 1.0
 */
public class ToolApplicationTest {

    public static void main(String[] args) {
        ExtractFile extractor = new ExtractFile();
        List<ResourceFile> listAllFiles = listAllFiles(args[0]);
        for (ResourceFile resourceFile : listAllFiles){
            resourceFile.accept(extractor);
        }
    }

    private static List<ResourceFile> listAllFiles(String filePath){
        List resourceFiles = new ArrayList<>(); //...根据后缀(pdf/ppt/word)由工厂方法创建不同的类对象(PdfFile/PPTFile/WordFile)
         resourceFiles.add(new PdfFile("a.pdf"));
         resourceFiles.add(new WordFile("b.word"));
         resourceFiles.add(new PPTFile("c.ppt"));
         return resourceFiles;
    }
}
