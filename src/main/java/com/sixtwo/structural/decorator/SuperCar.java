package com.sixtwo.structural.decorator;

/**
 * @author zhangshuaifei
 * @description 超级汽车
 * @date 2019/4/20 16:36
 */
public class SuperCar implements Car{
    protected Car car;

    public SuperCar(Car car) {
        this.car = car;
    }

    @Override
    public void move() {
        car.move();
    }
}
