package com.sixtwo.creation.factory.simplefactory.annotation;

/**
 * @author zhangshuaifei
 * @description
 * @date 2019/4/12 12:23
 */
@CarType(carType = "benz")
public class Benz implements Car {
    @Override
    public void run() {
        System.out.println("奔驰车在跑...");
    }
}
