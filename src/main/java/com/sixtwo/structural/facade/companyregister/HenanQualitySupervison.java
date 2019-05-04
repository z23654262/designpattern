package com.sixtwo.structural.facade.companyregister;

/**
 * @author zhangshuaifei
 * @description 河南质监局
 * @date 2019/4/22 18:45
 */
public class HenanQualitySupervison implements QualitySupervision{
    @Override
    public void checkQuality() {
        System.out.println("在河南质监局检测质量");
    }
}
