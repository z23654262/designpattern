package com.sixtwo.structural.bridge.basic;

/**
 * @author zhangshuaifei
 * @description 笔记本类型
 * @date 2019/4/14 15:47
 */
public class Laptop extends Computer{

    public Laptop(Brand brand) {
        super.brand = brand;
    }

    @Override
    public void sale() {
        brand.sale();
        System.out.println("笔记本售卖");
    }
}
