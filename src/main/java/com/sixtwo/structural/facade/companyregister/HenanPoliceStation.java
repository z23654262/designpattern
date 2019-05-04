package com.sixtwo.structural.facade.companyregister;

/**
 * @author zhangshuaifei
 * @description 河南公安局
 * @date 2019/4/22 18:46
 */
public class HenanPoliceStation implements PoliceStation{
    @Override
    public void getStampCarving() {
        System.out.println("在河南公安局领取刻章");
    }
}
