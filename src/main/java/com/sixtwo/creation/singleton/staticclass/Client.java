package com.sixtwo.creation.singleton.staticclass;

import org.junit.Test;

/**
 * @author zhangshuaifei
 * @description  单例模式静态内部类测试
 * @date 2019/4/12 9:32
 */
public class Client {

    @Test
    public void test1(){
        StaticClassSingleton instance1 = StaticClassSingleton.getInstance();
        StaticClassSingleton instance2 = StaticClassSingleton.getInstance();
        System.out.println(instance1 == instance2);
    }


}
