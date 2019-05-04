package com.sixtwo.behavior.state;

/**
 * @author zhangshuaifei
 * @description 房间空闲
 * @date 2019/5/4 20:45
 */
public class FreeState implements State{
    @Override
    public void handle() {
        System.out.println("房间空闲中...");
    }
}
