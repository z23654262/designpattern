package com.sixtwo.behavior.strategy;

import org.junit.Test;

/**
 * @author zhangshuaifei
 * @description 策略模式测试类
 * @date 2019/5/4 20:08
 */
public class Client {
    @Test
    public void test(){
        Context context = new Context(new OldCustomerManyStrategy());
        context.getDiscount(1000);
    }
}
