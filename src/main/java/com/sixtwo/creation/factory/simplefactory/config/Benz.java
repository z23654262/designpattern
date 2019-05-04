package com.sixtwo.creation.factory.simplefactory.config;

/**
 * @author zhangshuaifei
 * @description
 * @date 2019/4/12 12:23
 */
public class Benz implements Car{
    @Override
    public void run() {
        System.out.println("奔驰车在跑...");
    }
}
