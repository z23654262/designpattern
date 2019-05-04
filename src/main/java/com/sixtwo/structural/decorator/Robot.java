package com.sixtwo.structural.decorator;

/**
 * @author zhangshuaifei
 * @description 机器人
 * @date 2019/4/20 16:39
 */
public class Robot extends SuperCar{
    public Robot(Car car) {
        super(car);
    }

    public void speak(){
        System.out.println("说话了！！！");
    }
}
