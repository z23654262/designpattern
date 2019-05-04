package com.sixtwo.creation.singleton.reflex;

import org.junit.Test;

import java.lang.reflect.Constructor;

/**
 * @author zhangshuaifei
 * @description 懒汉单例模式测试
 * @date 2019/3/27 8:17
 */
public class Client {
    //测试懒汉单例模式
    @Test
    public void test1(){
        ReflexSingleton instance1 = ReflexSingleton.getInstance();
        ReflexSingleton instance2 = ReflexSingleton.getInstance();
        System.out.println(instance1 == instance2);//true
    }

    //测试反射问题
    @Test
    public void testReflex() throws Exception{
        ReflexSingleton instance = ReflexSingleton.getInstance();
        //获取
        Class<ReflexSingleton> clazz = (Class<ReflexSingleton>) Class.forName("com.sixtwo.creation.singleton.reflex.ReflexSingleton");
        //获取无参构造器
        Constructor<ReflexSingleton> constructor = clazz.getDeclaredConstructor(null);
        //setAccessible(true)跳过构造方法私有权限检查
        constructor.setAccessible(true);
        //构造器构造对象
        ReflexSingleton reflexSingleton1 = constructor.newInstance();

        ReflexSingleton reflexSingleton2 = constructor.newInstance();

        System.out.println(instance);
        System.out.println(reflexSingleton1);//生成了新对象
        System.out.println(reflexSingleton2);//生成了新对象

    }
}
