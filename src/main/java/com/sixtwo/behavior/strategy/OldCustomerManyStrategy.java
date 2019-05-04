package com.sixtwo.behavior.strategy;

/**
 * @author zhangshuaifei
 * @description 老顾客大批量订购--八折
 * @date 2019/5/4 20:03
 */
public class OldCustomerManyStrategy implements Strategy{
    @Override
    public double getPrice(double standardPrice) {
        System.out.println("八折");
        return standardPrice*0.8;
    }
}
