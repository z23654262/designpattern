package com.sixtwo.creation.factory.abstractfactory;

/**
 * @author zhangshuaifei
 * @description
 * @date 2019/4/12 19:01
 */
public class LuxuryEngine implements Engine {
    @Override
    public void run() {
        System.out.println("引擎运转很好！");
    }

    @Override
    public void start() {
        System.out.println("引擎启动，可自动启停！");
    }
}
