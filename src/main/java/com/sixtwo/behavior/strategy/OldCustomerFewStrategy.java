package com.sixtwo.behavior.strategy;

/**
 * @author zhangshuaifei
 * @description 老顾客小批量订购--八五折
 * @date 2019/5/4 20:03
 */
public class OldCustomerFewStrategy implements Strategy{
    @Override
    public double getPrice(double standardPrice) {
        System.out.println("八五折");
        return standardPrice*0.85;
    }
}
