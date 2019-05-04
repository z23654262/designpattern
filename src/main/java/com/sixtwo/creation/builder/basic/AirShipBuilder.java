package com.sixtwo.creation.builder.basic;

/***
* @Author zhangshuaifei
* @Description 宇宙飞船构建者------飞船的组装具体实现
* @Date 21:46 2019/4/12
**/
public abstract class AirShipBuilder {
    //为了能在子类访问到该变量，将其访问权限设置为protected
    protected AirShip airShip = new AirShip();

    //组装轨道舱
    public abstract void buildOrbitalModule();

    //组装发动机
    public abstract void buildEngine();

    //组装逃逸塔
    public abstract void buildEscapeTower();

    //返回飞船实体
    public AirShip airShipReady(){
        return airShip;
    }
}
