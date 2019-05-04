package com.sixtwo.creation.factory.simplefactory.basic;

/**
 * @author zhangshuaifei
 * @description
 * @date 2019/4/12 10:46
 */
public class Client {
    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        Car car1 = simpleFactory.createCar("奥迪");
        car1.run();
        car1 = simpleFactory.createCar("比亚迪");
        car1.run();
    }
}
