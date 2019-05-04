package com.sixtwo.structural.facade.companyregister;

/**
 * @author zhangshuaifei
 * @description 河南工商局
 * @date 2019/4/22 18:43
 */
public class HenanIndustryBusiness implements IndustryBusiness{
    @Override
    public void check() {
        System.out.println("河南工商局检查公司名字");
    }

    @Override
    public void post() {
        System.out.println("在河南工商局递交文件");
    }

    @Override
    public void getLicense() {
        System.out.println("在河南工商局获取执照");
    }
}
