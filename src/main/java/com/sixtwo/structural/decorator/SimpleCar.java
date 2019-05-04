package com.sixtwo.structural.decorator;

/**
 * @author zhangshuaifei
 * @description 普通车
 * @date 2019/4/20 16:35
 */
public class SimpleCar implements Car{
    @Override
    public void move() {
        System.out.println("汽车在地上跑");
    }
}
