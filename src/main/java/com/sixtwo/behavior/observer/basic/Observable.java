package com.sixtwo.behavior.observer.basic;

/**
 * @author zhangshuaifei
 * @description 被观察者接口---定义注册观察者，移除观察者，给所有观察者推送消息
 * @date 2019/5/5 12:10
 */
public interface Observable {
    void register(Observer observer);
    void remove(Observer observer);
    void notifyAllObservers();
}
