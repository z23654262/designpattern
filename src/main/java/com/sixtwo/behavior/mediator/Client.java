package com.sixtwo.behavior.mediator;

import org.junit.Test;

/**
 * @author zhangshuaifei
 * @description 中介者模式测试类
 * @date 2019/5/2 20:23
 */
public class Client {
    @Test
    public void test(){
        Mediator mediator = new ConcreteMediator();

        Department development = new Development(mediator);
        Department finacial = new Finacial(mediator);

        development.selfOperation();
        development.outOperation();
        System.out.println("---------------------");
        finacial.selfOperation();
        finacial.outOperation();
    }
}
