package com.sixtwo.creation.factory.factorymethod;

/**
 * @author zhangshuaifei
 * @description
 * @date 2019/4/12 11:19
 */
public class AudiFactory implements CarFactory{
    @Override
    public Car createCar() {
        return new Audi();
    }
}
