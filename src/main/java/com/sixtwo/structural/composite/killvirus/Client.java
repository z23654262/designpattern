package com.sixtwo.structural.composite.killvirus;

import org.junit.Test;

/**
 * @author zhangshuaifei
 * @description 先产生文件夹以及其中的文件，并且对其进行递归查杀
 * @date 2019/4/20 14:02
 */
public class Client {
    @Test
    public void test(){
        Folder folder = new Folder("我的文档");
        Folder video = new Folder("电影");
        Folder text = new Folder("笔记");
        AbstractFile text1 = new TextFile("笔记1.text");
        AbstractFile text2 = new TextFile("笔记2.text");
        AbstractFile video1 = new TextFile("电影1.avi");
        AbstractFile video2 = new TextFile("电影2.avi");
        text.addFile(text1);
        text.addFile(text2);
        video.addFile(video1);
        video.addFile(video2);
        folder.addFile(video);
        folder.addFile(text);

        folder.killVirus();
    }
}
