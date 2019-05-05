package com.sixtwo.behavior.observer.basicX;

import java.util.Observable;

/**
 * @author zhangshuaifei
 * @description 微信公众号----继承JavaSE提供的Observable
 * @date 2019/5/5 13:44
 */
public class WeChat extends Observable {
    private String message;

    public void set(String message){
        this.message = message;
        setChanged();
        notifyObservers();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
