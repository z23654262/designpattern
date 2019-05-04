package com.sixtwo.structural.decorator;

import org.junit.Test;

/**
 * @author zhangshuaifei
 * @description 测试类
 * @date 2019/4/20 16:43
 */
public class Client {
    @Test
    public void test(){
        System.out.println("------------------");
        Car car = new SimpleCar();
        car.move();
        System.out.println("------------------");
        Robot robot = new Robot(car);
        robot.move();
        robot.speak();
        System.out.println("------------------");
        AirCraft airCraft = new AirCraft(car);
        airCraft.move();
        airCraft.fly();
        System.out.println("------------------");
    }
}
