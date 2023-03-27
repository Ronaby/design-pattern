package com.ronbay.desigin.module.vistor.demo01;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 访问者模式测试类
 * @Author
 * @Date 2023/3/27
 * @Version 1.0
 */
public class VisitorTest {

    public static void main(String[] args) {
        List<ResourceFile> listAllResourceFiles = listAllResourceFiles(args[0]);
        for (ResourceFile resourceFile:listAllResourceFiles){
            resourceFile.extract2Txt();
        }
    }

    private static List<ResourceFile> listAllResourceFiles(String filePath){
        List<ResourceFile> resourceFiles = new ArrayList<>();
        resourceFiles.add(new PdfFile("a.pdf"));
        resourceFiles.add(new WordFile("b.pdf"));
        resourceFiles.add(new PPTFile("c.pdf"));
        return resourceFiles;
    }

}
