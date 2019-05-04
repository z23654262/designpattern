package com.sixtwo.behavior.mediator;

/**
 * @author zhangshuaifei
 * @description 开发部
 * @date 2019/5/2 19:17
 */
public class Development implements Department {

    private Mediator mediator;

    public Development(Mediator mediator) {
        this.mediator = mediator;
        mediator.register("development",this);
    }

    @Override
    public void selfOperation() {
        System.out.println("开发部开发软件");
    }

    @Override
    public void outOperation() {
        System.out.println("项目技术方面需要资金支持");
        mediator.command("finacial");
    }
}
