package com.sixtwo.structural.proxy.dynamicproxy.jdkproxy;

import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author zhangshuaifei
 * @description JDK动态代理测试类
 * @date 2019/4/13 21:11
 */
public class Client {
    @Test
    public void test(){
        //创建真实持久化类
        ProductDao productDaoImpl = new ProductDaoImpl();
        //创建一个与代理对象相关联的InvocationHandler
        InvocationHandler proxyDaoJDKProxy = new ProductDaoJDKProxy(productDaoImpl);
        //创建代理持久化类
        ProductDao productDaoProxy = (ProductDao) Proxy.newProxyInstance(Client.class.getClassLoader(),new Class[]{ProductDao.class},proxyDaoJDKProxy);
        //调用代理持久化类的方法
        productDaoProxy.insertProduct();
        productDaoProxy.deleteProduct();
        productDaoProxy.updateProduct();
        productDaoProxy.selectProduct();
    }
}
