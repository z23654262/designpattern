package com.sixtwo.structural.bridge.basic;

/**
 * @author zhangshuaifei
 * @description 戴尔品牌
 * @date 2019/4/14 15:44
 */
public class Dell implements Brand{
    @Override
    public void sale() {
        System.out.print("戴尔");
    }
}
