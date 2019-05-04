package com.sixtwo.creation.factory.abstractfactory;

/**
 * @author zhangshuaifei
 * @description
 * @date 2019/4/12 19:04
 */
public class LowTyre implements Tyre {
    @Override
    public void revolve() {
        System.out.println("轮胎转动磨损大！");
    }
}
