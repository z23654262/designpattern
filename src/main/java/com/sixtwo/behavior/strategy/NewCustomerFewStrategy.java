package com.sixtwo.behavior.strategy;

/**
 * @author zhangshuaifei
 * @description 新顾客小批量订购--原价
 * @date 2019/5/4 20:03
 */
public class NewCustomerFewStrategy implements Strategy{
    @Override
    public double getPrice(double standardPrice) {
        System.out.println("不打折，原价");
        return standardPrice;
    }
}
