package com.sixtwo.structural.bridge.basic;

/**
 * @author zhangshuaifei
 * @description 联想品牌
 * @date 2019/4/14 15:44
 */
public class Lenovo implements Brand{
    @Override
    public void sale() {
        System.out.print("联想");
    }
}
