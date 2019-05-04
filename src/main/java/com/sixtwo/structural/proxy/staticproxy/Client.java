package com.sixtwo.structural.proxy.staticproxy;

import org.junit.Test;

/**
 * @author zhangshuaifei
 * @description 静态代理测试类
 * @date 2019/4/13 21:11
 */
public class Client {
    @Test
    public void test(){
        //真实持久化类
        ProductDao productDao = new ProductDaoImpl();
        //代理持久化类
        ProductDao productDaoProxy = new ProductDaoProxy(productDao);
        //调用代理持久化类的方法
        productDaoProxy.insertProduct();
        productDaoProxy.deleteProduct();
        productDaoProxy.updateProduct();
    }
}
