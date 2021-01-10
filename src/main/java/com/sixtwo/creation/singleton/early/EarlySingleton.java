package com.sixtwo.creation.singleton.early;

import java.io.Serializable;

/**
 * @author zhangshuaifei
 * @description 单例模式-----饿汉模式mac
 *              1)优点：实例在类加载时产生，不存在线程安全问题
 *              2)缺点：如果应用程序中没有调用该实例，会造成空间的浪费
 * @date 2019/4/11 20:56
 */
public class EarlySingleton implements Serializable {
    private static final long serialVersionUID = 1L;

    //类加载(初始化)时会产生对象实例，保证线程安全
    private static EarlySingleton earlySingleton = new EarlySingleton();

    //构造方法私有(如果添加新的构造方法访问权限必须为private)
    private EarlySingleton(){

    }

    //公有获取实例方法
    public static EarlySingleton getInstance(){
        return earlySingleton;
    }

    //解决反序列化问题，由于在类加载时已经生成实例，所以不必调用getInstance方法，直接返回实例即可
    public Object readResolve(){
        return earlySingleton;
    }
}
