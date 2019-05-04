package com.sixtwo.structural.proxy.dynamicproxy.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import org.junit.Test;


/**
 * @author zhangshuaifei
 * @description Cglib动态代理测试类
 * @date 2019/4/13 21:11
 */
public class Client {
    @Test
    public void test(){
        //创建真实持久化对象
        ProductDao productDaoImpl = new ProductDaoImpl();
        //创建Cglib负责拦截的类
        ProductDaoCglibProxy productDaoCglibProxy = new ProductDaoCglibProxy();
        //cglib中用于创建动态代理的加强器
        Enhancer enhancer = new Enhancer();
        //设置要创建动态代理的类
        enhancer.setSuperclass(ProductDaoImpl.class);
        //设置回调，相当于是对于代理类上所有方法的调用，都会调用CallBack，而Callback则需要实行intercept()方法进行拦截
        enhancer.setCallback(productDaoCglibProxy);
        //创建实际代理对象
        ProductDao productDaoProxy = (ProductDao) enhancer.create();
        productDaoProxy.insertProduct();
        productDaoProxy.deleteProduct();
        productDaoProxy.selectProduct();
        productDaoProxy.updateProduct();
    }
}
