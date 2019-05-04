package com.sixtwo.creation.factory.factorymethod;
/***
* @Author zhangshuaifei
* @Description 工厂方法模式：定义汽车工厂接口
 *              1)需要哪种产品找对应的工厂
* @Date 11:17 2019-04-12
* @Param
* @return
**/
public interface CarFactory {
    public Car createCar();
}
