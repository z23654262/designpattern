package com.sixtwo.creation.singleton.enummodel;

/**
 * @author zhangshuaifei
 * @description 单例模式----枚举实现
 *              1)优点：线程安全，解决了反序列化问题，执行效率高
 *              2)缺点：没有延时加载功能
 * @date 2019/4/12 9:21
 */
public enum EnumSingleton {
    //枚举类型自动为单例模式
    INSTANCE
}
