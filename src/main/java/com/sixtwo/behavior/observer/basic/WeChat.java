package com.sixtwo.behavior.observer.basic;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangshuaifei
 * @description 微信公众号
 * @date 2019/5/5 12:36
 */
public class WeChat implements Observable{
    private List<Observer> list;
    private String message;

    public void setMessage(String message) {
        System.out.println("微信服务更新消息："+message);
        this.message = message;
        notifyAllObservers();
    }

    public String getMessage() {
        return message;
    }

    public WeChat() {
        this.list = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        list.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        list.remove(observer);
    }

    @Override
    public void notifyAllObservers() {
        for (Observer observer:list) {
            observer.update(this);
        }
    }
}
