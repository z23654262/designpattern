package com.sixtwo.behavior.state;

/**
 * @author zhangshuaifei
 * @description 已入住
 * @date 2019/5/4 20:47
 */
public class MoveInState implements State{
    @Override
    public void handle() {
        System.out.println("房间已入住...");
    }
}
