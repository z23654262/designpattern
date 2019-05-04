package com.sixtwo.creation.builder.basic;

/***
* @Author zhangshuaifei
* @Description 宇宙飞船构建者监工-----负责调用构建者建造飞船，然后返回给客户端
* @Date 22:03 2019/4/12
**/
public abstract class AirShipDirector {
    //宇宙飞船构建者
    protected AirShipBuilder airShipBuilder;

    public void setAirShipBuilder(AirShipBuilder airShipBuilder) {
        this.airShipBuilder = airShipBuilder;
    }

    //构建并返回宇宙飞船实体
    public AirShip createAirShip(){
        airShipBuilder.buildEngine();
        airShipBuilder.buildOrbitalModule();
        airShipBuilder.buildEscapeTower();
        return airShipBuilder.airShipReady();
    }


}
