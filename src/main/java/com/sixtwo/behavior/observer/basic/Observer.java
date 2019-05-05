package com.sixtwo.behavior.observer.basic;

/**
 * @author zhangshuaifei
 * @description 观察者接口---将统一的更新方法定义出来  即用户
 *              模仿微信公众号给关注的人推送消息
 * @date 2019/5/5 10:02
 */
public interface Observer {
    void update(Observable observable);
}
