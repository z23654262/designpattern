package com.sixtwo.structural.bridge.basic;

import org.junit.Test;

/**
 * @author zhangshuaifei
 * @description 桥接模式测试类
 * @date 2019/4/14 15:49
 */
public class Client {
    @Test
    public void test(){
        Computer computer = new Laptop(new Dell());
        computer.sale();//戴尔笔记本售卖

        computer = new Desktop();
        computer.setBrand(new Lenovo());
        computer.sale();//联想台式机售卖
    }
}
