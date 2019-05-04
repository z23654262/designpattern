package com.sixtwo.creation.factory.abstractfactory;

/**
 * @author zhangshuaifei
 * @description 汽车抽象工厂,以产品族来创建方法
 * @date 2019/4/12 19:05
 */
public interface CarFactory {
    public Engine createEngine();
    public Seat createSeat();
    public Tyre createTyre();
}
