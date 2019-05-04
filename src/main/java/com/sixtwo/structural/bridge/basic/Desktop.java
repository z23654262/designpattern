package com.sixtwo.structural.bridge.basic;

/**
 * @author zhangshuaifei
 * @description 台式机电脑
 * @date 2019/4/14 15:47
 */
public class Desktop extends Computer{

    public Desktop(){

    }

    public Desktop(Brand brand) {
        super.brand = brand;
    }

    @Override
    public void sale() {
        brand.sale();
        System.out.println("台式机售卖");
    }
}
