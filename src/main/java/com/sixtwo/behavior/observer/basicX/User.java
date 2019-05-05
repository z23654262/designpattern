package com.sixtwo.behavior.observer.basicX;

import java.util.Observable;
import java.util.Observer;

/**
 * @author zhangshuaifei
 * @description 用户----继承JavaSE提供的Observer
 * @date 2019/5/5 13:46
 */
public class User implements Observer {
    private String message;
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        this.message = ((WeChat)o).getMessage();
        System.out.println(name+"收到推送消息："+message);
    }
}
