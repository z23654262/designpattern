package com.sixtwo.behavior.observer.basicX;

import org.junit.Test;

import java.util.Observer;

/**
 * @author zhangshuaifei
 * @description 使用java提供的观察者模式来实现微信公众号向关注的用户推送消息
 * @date 2019/5/5 13:51
 */
public class Client {
    @Test
    public void test(){
        WeChat weChat = new WeChat();

        Observer user1 = new User("张三");
        Observer user2 = new User("李四");
        Observer user3 = new User("王五");

        weChat.addObserver(user1);
        weChat.addObserver(user2);
        weChat.addObserver(user3);

        weChat.set("观察者模式！！！");

        weChat.deleteObserver(user3);

        weChat.set("观察者模式2！！！");
    }
}
