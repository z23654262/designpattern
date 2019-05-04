package com.sixtwo.structural.facade.companyregister;

/**
 * @author zhangshuaifei
 * @description 工商局
 * @date 2019/4/22 18:35
 */
public interface IndustryBusiness {
    //工商局检查公司名字是否重复
    void check();
    //递交文件
    void post();
    //领取执照
    void getLicense();
}
