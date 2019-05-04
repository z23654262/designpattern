package com.sixtwo.structural.proxy.dynamicproxy.javassistproxy;

import org.junit.Test;

/**
 * @author zhangshuaifei
 * @description Javassist动态代理测试类
 * @date 2019/4/13 21:11
 */
public class Client {
    //事先需要创建被代理对象
    @Test
    public void test() throws Exception{
        ProductDao productDao = new ProductDaoImpl();

        ProductDaoJavassistProxy productDaoJavassistProxy = new ProductDaoJavassistProxy();

        productDaoJavassistProxy.setProductDao(productDao);

        //获取代理对象
        ProductDao productDaoProxy = productDaoJavassistProxy.getProxy();

        //使用代理类来调用功能
        productDaoProxy.insertProduct();
        productDaoProxy.deleteProduct();
        productDaoProxy.selectProduct();
        productDaoProxy.updateProduct();
    }

    //事先不需要创建被代理对象
    @Test
    public void test2()throws Exception{
        ProductDaoJavassistProxyX productDaoJavassistProxy = new ProductDaoJavassistProxyX();

        //获取代理对象
        ProductDao productDaoProxy = productDaoJavassistProxy.getProxy(ProductDaoImpl.class);

        //使用代理类来调用功能
        productDaoProxy.insertProduct();
        productDaoProxy.deleteProduct();
        productDaoProxy.selectProduct();
        productDaoProxy.updateProduct();
    }
}
