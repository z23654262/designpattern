package com.sixtwo.behavior.state;

/**
 * @author zhangshuaifei
 * @description 房间已预订
 * @date 2019/5/4 20:46
 */
public class BookedState implements State{
    @Override
    public void handle() {
        System.out.println("房间已预订...");
    }
}
