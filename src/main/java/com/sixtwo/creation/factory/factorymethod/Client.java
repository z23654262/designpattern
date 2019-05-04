package com.sixtwo.creation.factory.factorymethod;

/**
 * @author zhangshuaifei
 * @description
 * @date 2019/4/12 11:19
 */
public class Client {
    public static void main(String[] args) {
        CarFactory carFactory = new AudiFactory();
        Car car = carFactory.createCar();
        car.run();
        carFactory = new BydFactory();
        car = carFactory.createCar();
        car.run();
    }
}
