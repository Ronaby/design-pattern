package com.ronbay.desigin.module.vistor.demo03;


import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: 访问者模式测试类
 * @Description:
 * @Author
 * @Date 2023/3/27
 * @Version 1.0
 */
public class ToolApplicatonTest {

    public static void main(String[] args) {
        Extractor extractor = new Extractor();
        List<ResourceFile> resourceFileLists = resourceFileLists(args[0]);
        for (ResourceFile resourceFile : resourceFileLists){
            resourceFile.accept(extractor);
        }
    }

    private static List<ResourceFile> resourceFileLists(String filePath){
        List<ResourceFile> resourceFileList = new ArrayList<>();
        resourceFileList.add(new PdfFile("a.pdf"));
        resourceFileList.add(new WordFile("a.word"));
        resourceFileList.add(new PPTFile("a.word"));
        return resourceFileList;
    }
}
