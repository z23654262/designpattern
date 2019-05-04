package com.sixtwo.structural.proxy.dynamicproxy.jdkproxy;

import org.junit.Test;
import sun.misc.ProxyGenerator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author zhangshuaifei
 * @description 查看动态代理生成的代理类源码
 * @date 2019/4/14 11:39
 */
public class ViewProxyClass {
    @Test
    public void test(){
        //创建真实持久化类
        ProductDao productDaoImpl = new ProductDaoImpl();
        //创建一个与代理对象相关联的InvocationHandler
        InvocationHandler productDaoJDKProxy = new ProductDaoJDKProxy(productDaoImpl);
        //创建代理持久化类
        ProductDao productDaoProxy = (ProductDao) Proxy.newProxyInstance(Client.class.getClassLoader(),new Class[]{ProductDao.class},productDaoJDKProxy);
        //调用代理持久化类的方法
        productDaoProxy.insertProduct();

        byte[] bts = ProxyGenerator.generateProxyClass("$ProductDaoJDKProxy", new Class[]{ProductDao.class});
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(new File("D:\\java\\project\\designpattern\\src\\main\\java\\com\\sixtwo\\structural\\proxy\\dynamicproxy\\jdkproxy\\$ProductDaoJDKProxy.class"));
            fos.write(bts);
            fos.flush();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
