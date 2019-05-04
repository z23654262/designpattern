package com.sixtwo.creation.factory.abstractfactory;

import org.junit.Test;

/**
 * @author zhangshuaifei
 * @description
 * @date 2019/4/12 19:09
 */
public class Client {
    @Test
    public void test(){
        CarFactory carFactory = new LowCarFactory();
        Engine engine = carFactory.createEngine();
        engine.run();
        engine.start();
    }
}
