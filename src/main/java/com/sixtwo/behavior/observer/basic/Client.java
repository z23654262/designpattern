package com.sixtwo.behavior.observer.basic;

import org.junit.Test;

/**
 * @author zhangshuaifei
 * @description 观察者模式测试类
 * @date 2019/5/5 12:48
 */
public class Client {
    @Test
    public void test(){
        WeChat weChat = new WeChat();

        Observer user1 = new User("张三");
        Observer user2 = new User("李四");
        Observer user3 = new User("王五");

        weChat.register(user1);
        weChat.register(user2);
        weChat.register(user3);

        weChat.setMessage("观察者模式！！");

        System.out.println("------------------");

        weChat.remove(user2);

        weChat.setMessage("观察者模式2！！");
    }
}
