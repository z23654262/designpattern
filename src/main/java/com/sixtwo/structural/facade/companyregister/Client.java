package com.sixtwo.structural.facade.companyregister;

import org.junit.Test;

/**
 * @author zhangshuaifei
 * @description 使用外观对象的测试类
 *              检查名字-->递交文件-->质量检测-->领取执照-->领取刻章
 * @date 2019/4/22 18:46
 */
public class Client {
    @Test
    public void test(){
        IndustryBusiness industryBusiness = new HenanIndustryBusiness();
        QualitySupervision qualitySupervision = new HenanQualitySupervison();
        PoliceStation policeStation = new HenanPoliceStation();

        industryBusiness.check();
        industryBusiness.post();
        qualitySupervision.checkQuality();
        industryBusiness.getLicense();
        policeStation.getStampCarving();
    }
}
