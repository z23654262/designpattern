package com.sixtwo.behavior.strategy;

/**
 * @author zhangshuaifei
 * @description 新顾客大批量订购--九折
 * @date 2019/5/4 20:03
 */
public class NewCustomerManyStrategy implements Strategy{
    @Override
    public double getPrice(double standardPrice) {
        System.out.println("打九折");
        return standardPrice*0.9;
    }
}
