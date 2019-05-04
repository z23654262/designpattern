package com.sixtwo.structural.adapter.basic;

import org.junit.Test;

/**
 * @author zhangshuaifei
 * @description
 * @date 2019/4/13 15:06
 */
public class Client {
    @Test
    public void test(){
        //客户端的电脑
        Laptop laptop = new Laptop();
        //客户端所拥有的键盘
        KeyBoard keyBoard = new KeyBoard();
        //客户端所拥有的适配器
        Target target = new KeyBoardAdapter(keyBoard);
        //客户端通过适配器来调用键盘的功能
        laptop.inputKey(target);
    }
}
