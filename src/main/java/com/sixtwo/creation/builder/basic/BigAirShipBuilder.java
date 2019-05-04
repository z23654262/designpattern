package com.sixtwo.creation.builder.basic;

/**
 * @author zhangshuaifei
 * @description  大型宇宙飞船构建者---所有组件都为大型的
 * @date 2019/4/12 21:53
 */
public class BigAirShipBuilder extends AirShipBuilder {
    @Override
    public void buildOrbitalModule() {
        super.airShip.setOrbitalModule(new OrbitalModule("大型轨道舱"));
    }

    @Override
    public void buildEngine() {
        super.airShip.setEngine(new Engine("大型发动机"));
    }

    @Override
    public void buildEscapeTower() {
        super.airShip.setEscapeTower(new EscapeTower("大型逃逸塔"));
    }
}
