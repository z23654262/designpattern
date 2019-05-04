package com.sixtwo.structural.bridge.basic;

/**
 * @author zhangshuaifei
 * @description 电脑电脑
 * @date 2019/4/14 15:42
 */
public abstract class Computer {
    protected Brand brand;

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    //电脑售卖
    public abstract void sale();
}
