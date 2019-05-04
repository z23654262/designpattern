package com.sixtwo.structural.composite.killvirus;

/**
 * @author zhangshuaifei
 * @description 记事本文件
 * @date 2019/4/20 13:56
 */
public class TextFile implements AbstractFile{

    private String name;

    public TextFile(String name) {
        this.name = name;
    }

    @Override
    public void killVirus() {
        System.out.println("对"+name+"进行查杀");
    }
}
