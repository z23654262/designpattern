package com.sixtwo.structural.decorator;

/**
 * @author zhangshuaifei
 * @description 飞行器
 * @date 2019/4/20 16:41
 */
public class AirCraft extends SuperCar{
    public AirCraft(Car car) {
        super(car);
    }
    public void fly(){
        System.out.println("飞行！！！");
    }
}
