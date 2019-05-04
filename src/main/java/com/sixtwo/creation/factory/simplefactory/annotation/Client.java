package com.sixtwo.creation.factory.simplefactory.annotation;


/**
 * @author zhangshuaifei
 * @description
 * @date 2019/4/12 10:46
 */
public class Client {
    public static void main(String[] args) throws Exception{
        SimpleFactory simpleFactory = new SimpleFactory();
        Car car = simpleFactory.createCar("benz");
        car.run();
    }


}
