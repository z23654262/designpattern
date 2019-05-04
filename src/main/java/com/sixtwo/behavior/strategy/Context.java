package com.sixtwo.behavior.strategy;

/**
 * @author zhangshuaifei
 * @description 使用策略类来解决问题，负责和具体的策略类交互，将算法和客户端分离，可以使得算法可以独立于客户端而变化
 * @date 2019/5/4 20:06
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void getDiscount(double standardPrice){
        System.out.println(strategy.getPrice(standardPrice));
    }
}
