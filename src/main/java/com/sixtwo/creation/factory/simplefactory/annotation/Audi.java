package com.sixtwo.creation.factory.simplefactory.annotation;

/**
 * @author zhangshuaifei
 * @description
 * @date 2019/4/12 10:37
 */
@CarType(carType = "audi")
public class Audi implements Car {
    @Override
    public void run() {
        System.out.println("奥迪车在跑...");
    }
}
