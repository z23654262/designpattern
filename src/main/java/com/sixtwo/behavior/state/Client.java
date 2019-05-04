package com.sixtwo.behavior.state;

import org.junit.Test;

/**
 * @author zhangshuaifei
 * @description 状态模式测试类
 * @date 2019/5/4 20:48
 */
public class Client {

    @Test
    public void test(){
        Room room = new Room(new FreeState());
        room.request();
        room.setState(new BookedState());
        room.request();
        room.setState(new MoveInState());
        room.request();
    }
}
