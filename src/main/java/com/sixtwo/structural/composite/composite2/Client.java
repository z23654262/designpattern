package com.sixtwo.structural.composite.composite2;

import org.junit.Test;

/**
 * @author zhangshuaifei
 * @description 组合模式测试类：
 *              测试结构为：一个大盘子内有一个小盘子、两个苹果，、一个香蕉，小盘子内又有一个苹果、一个香蕉，要求调用大盘子的吃方法，把所有水果吃完
 * @date 2019/4/16 8:59
 */
public class Client {
    @Test
    public void test1(){
        Plate bigPlate = new Plate();
        //大盘子内的水果
        bigPlate.addComponent(new Apple());
        bigPlate.addComponent(new Apple());
        bigPlate.addComponent(new Banana());
        //小盘子以及小盘子内的水果
        Plate smallPlate = new Plate();
        smallPlate.addComponent(new Apple());
        smallPlate.addComponent(new Banana());
        bigPlate.addComponent(smallPlate);
        //大盘子的eat方法
        bigPlate.eat();
    }
}
