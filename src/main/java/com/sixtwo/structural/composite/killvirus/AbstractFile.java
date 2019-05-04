package com.sixtwo.structural.composite.killvirus;

/**
 * @author zhangshuaifei
 * @description 虚拟文件-----组件（可以是文件、文件夹）
 * @date 2019/4/20 13:54
 */
public interface AbstractFile {
    //拥有共性杀毒方法
    void killVirus();
}
