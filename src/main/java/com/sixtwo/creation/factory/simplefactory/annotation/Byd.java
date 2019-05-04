package com.sixtwo.creation.factory.simplefactory.annotation;

/**
 * @author zhangshuaifei
 * @description
 * @date 2019/4/12 10:38
 */
@CarType(carType = "byd")
public class Byd implements Car {
    @Override
    public void run() {
        System.out.println("比亚迪在跑...");
    }
}
