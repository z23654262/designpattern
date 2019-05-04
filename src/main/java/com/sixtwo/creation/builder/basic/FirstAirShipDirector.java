package com.sixtwo.creation.builder.basic;

/**
 * @author zhangshuaifei
 * @description 第一宇宙飞船构建者监工
 * @date 2019/4/12 22:10
 */
public class FirstAirShipDirector extends AirShipDirector{
    public FirstAirShipDirector(AirShipBuilder airShipBuilder) {
        super.airShipBuilder = airShipBuilder;
    }
}
