package com.sixtwo.structural.facade.companyregister;

import org.junit.Test;

/**
 * @author zhangshuaifei
 * @description 使用外观对象的测试类
 * @date 2019/4/22 18:47
 */
public class FacadeClient {
    @Test
    public void test(){
        Facade facade = new Facade();
        facade.registerCompany();
    }
}
