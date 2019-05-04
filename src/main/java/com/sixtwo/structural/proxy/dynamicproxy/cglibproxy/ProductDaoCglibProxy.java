package com.sixtwo.structural.proxy.dynamicproxy.cglibproxy;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author zhangshuaifei
 * @description 基于Cglib的动态代理类
 * @date 2019/4/14 13:34
 */
public class ProductDaoCglibProxy implements MethodInterceptor {
    @Override
    public Object intercept(Object object, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {

        System.out.println("事务开启");

        methodProxy.invokeSuper(object,args);

        System.out.println("事务提交");

        return null;
    }
}
