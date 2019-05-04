package com.sixtwo.creation.factory.abstractfactory;

/**
 * @author zhangshuaifei
 * @description
 * @date 2019/4/12 19:02
 */
public class LuxurySeat implements Seat{
    @Override
    public void message() {
        System.out.println("座椅可调整，可按摩");
    }
}
