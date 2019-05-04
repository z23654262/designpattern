package com.sixtwo.creation.factory.abstractfactory;

/**
 * @author zhangshuaifei
 * @description
 * @date 2019/4/12 19:02
 */
public class LowEngine implements Engine{
    @Override
    public void run() {
        System.out.println("引擎启动一般！");
    }

    @Override
    public void start() {
        System.out.println("引擎启动慢！");
    }
}
