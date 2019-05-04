package com.sixtwo.creation.singleton.staticclass;

/**
 * @author zhangshuaifei
 * @description 单例模式-----通过静态内部类来实现
 *              1)优点：线程安全，调用效率高，并且实现了延时加载
 *              2)缺点：
 * @date 2019/4/12 9:27
 */
public class StaticClassSingleton {

    //静态内部类
    private static class SingletonClassInstance{
        private static final StaticClassSingleton instance = new StaticClassSingleton();
    }

    //私有构造方法
    private StaticClassSingleton(){}

    //返回静态内部类中的实例
    public static StaticClassSingleton getInstance(){
        return SingletonClassInstance.instance;
    }
}
