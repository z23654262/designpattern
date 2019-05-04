package com.sixtwo.structural.composite.killvirus;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangshuaifei
 * @description 文件夹(具有递归查杀的功能，并且还可以对其中的文件进行CRUD)
 * @date 2019/4/20 13:57
 */
public class Folder implements AbstractFile{

    private String name;

    private List<AbstractFile> files = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void addFile(AbstractFile file){
        files.add(file);
    }

    public void removeFile(AbstractFile file){
        files.remove(file);
    }

    public void getFile(int index){
        files.get(index);
    }

    @Override
    public void killVirus() {
        System.out.println("对"+name+"进行查杀");
        for (AbstractFile abstractFile:files){
            abstractFile.killVirus();
        }
    }
}
