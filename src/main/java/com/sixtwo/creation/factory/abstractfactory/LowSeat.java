package com.sixtwo.creation.factory.abstractfactory;

/**
 * @author zhangshuaifei
 * @description
 * @date 2019/4/12 19:03
 */
public class LowSeat implements Seat {
    @Override
    public void message() {
        System.out.println("座椅不可调整，不可按摩");
    }
}
