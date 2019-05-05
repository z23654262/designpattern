package com.sixtwo.behavior.observer.basic;

/**
 * @author zhangshuaifei
 * @description 微信用户
 * @date 2019/5/5 10:03
 */
public class User implements Observer{
    private String name;
    private String message;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable observable) {
        this.message = ((WeChat)observable).getMessage();
        System.out.println(name+"收到推送消息："+message);
    }
}
