package com.sixtwo.structural.proxy.dynamicproxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author zhangshuaifei
 * @description
 * @date 2019/4/13 21:25
 */
public class ProductDaoJDKProxy implements InvocationHandler {

    //真实持久化对象
    private ProductDao productDao;

    public ProductDaoJDKProxy(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object object = null;

        //方法执行前
        System.out.println("事务开启");

        object = method.invoke(productDao,args);

        //方法执行后
        System.out.println("事务提交");

        return object;
    }
}
