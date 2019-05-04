package com.sixtwo.behavior.state;

/**
 * @author zhangshuaifei
 * @description 房间------即Context  根据状态不同来切换不同的行为
 * @date 2019/5/4 20:48
 */
public class Room {
    private State state;

    public Room(State state) {
        this.state = state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void request(){
        state.handle();
    }
}
