package com.sixtwo.behavior.mediator;

/**
 * @author zhangshuaifei
 * @description 财务部
 * @date 2019/5/2 19:56
 */
public class Finacial implements Department{
    private Mediator mediator;

    public Finacial(Mediator mediator) {
        this.mediator = mediator;
        mediator.register("finacial",this);
    }
    @Override
    public void selfOperation() {
        System.out.println("数钱，发钱");
    }

    @Override
    public void outOperation() {
        System.out.println("发钱，好好干活！");
    }
}
