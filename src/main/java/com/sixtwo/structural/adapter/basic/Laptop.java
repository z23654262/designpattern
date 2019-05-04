package com.sixtwo.structural.adapter.basic;

/**
 * @author zhangshuaifei
 * @description 客户端（笔记本只有USB插口）只能调用提供USB插头的键盘，现在有圆形插头的键盘
 * @date 2019/4/13 14:54
 */
public class Laptop {

    public void inputKey(Target target){
        //需要调用提供USB插头的键盘：即拥有USBPlug()方法的类！
        target.USBPlug();
    }
}
