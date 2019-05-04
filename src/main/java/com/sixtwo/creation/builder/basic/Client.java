package com.sixtwo.creation.builder.basic;

import org.junit.Test;

/**
 * @author zhangshuaifei
 * @description
 * @date 2019/4/12 22:12
 */
public class Client {
    //测试第一宇宙飞船构建者监工建造大型和小型宇宙飞船
    @Test
    public void testFirstAirShipDirector(){
        AirShipDirector airShipDirector = new FirstAirShipDirector(new SmallAirShipBuilder());
        AirShip airShip = airShipDirector.createAirShip();
        airShip.launch();
        airShipDirector.setAirShipBuilder(new BigAirShipBuilder());
        airShip = airShipDirector.createAirShip();
        airShip.launch();
    }
}
