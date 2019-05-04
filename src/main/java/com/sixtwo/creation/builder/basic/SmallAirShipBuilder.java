package com.sixtwo.creation.builder.basic;

/**
 * @author zhangshuaifei
 * @description  小型宇宙飞船构建者---所有组件都为小型的
 * @date 2019/4/12 21:53
 */
public class SmallAirShipBuilder extends AirShipBuilder {
    @Override
    public void buildOrbitalModule() {
        super.airShip.setOrbitalModule(new OrbitalModule("小型轨道舱"));
    }

    @Override
    public void buildEngine() {
        super.airShip.setEngine(new Engine("小型发动机"));
    }

    @Override
    public void buildEscapeTower() {
        super.airShip.setEscapeTower(new EscapeTower("小型逃逸塔"));
    }
}
