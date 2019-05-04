package com.sixtwo.creation.factory.simplefactory.config;

/**
 * @author zhangshuaifei
 * @description
 * @date 2019/4/12 10:38
 */
public class Byd implements Car {
    @Override
    public void run() {
        System.out.println("比亚迪在跑...");
    }
}
