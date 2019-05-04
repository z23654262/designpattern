package com.sixtwo.structural.facade.companyregister;

/**
 * @author zhangshuaifei
 * @description 外观对象---代表公司注册流程
 * @date 2019/4/22 18:47
 */
public class Facade {
    private IndustryBusiness industryBusiness = new HenanIndustryBusiness();
    private QualitySupervision qualitySupervision = new HenanQualitySupervison();
    private PoliceStation policeStation = new HenanPoliceStation();

    public void registerCompany(){
        industryBusiness.check();
        industryBusiness.post();
        qualitySupervision.checkQuality();
        industryBusiness.getLicense();
        policeStation.getStampCarving();
    }
}
