package com.sixtwo.structural.composite.killvirus;

/**
 * @author zhangshuaifei
 * @description 视频文件
 * @date 2019/4/20 13:56
 */
public class VideoFile implements AbstractFile{

    private String name;

    public VideoFile(String name) {
        this.name = name;
    }

    @Override
    public void killVirus() {
        System.out.println("对"+name+"进行查杀");
    }
}
