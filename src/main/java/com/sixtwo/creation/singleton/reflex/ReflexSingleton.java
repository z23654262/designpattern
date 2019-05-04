package com.sixtwo.creation.singleton.reflex;

import java.io.Serializable;

/**
 * @author zhangshuaifei
 * @description 单例模式-----懒汉模式
 *              1)优点：按需加载，不使用时不产生对象占用空间
 *              2)缺点：实现较复杂，需要考虑线程安全问题
 * @date 2019/3/27 8:13
 */
public class ReflexSingleton implements Serializable {

    //volatile关键字作用为禁止指令重排，避免在生成实例时出现线程安全问题
    private static volatile ReflexSingleton reflexSingleton;

    //构造方法私有，解决反射问题
    private ReflexSingleton(){
        if(reflexSingleton != null){//如果已存在单例对象，又尝试新生成对象，会抛出异常
            throw new RuntimeException();
        }
    }

    /**
     * 双锁机制来解决懒汉模式下的线程安全问题
     * @return
     */
    public static ReflexSingleton getInstance(){
        if(null == reflexSingleton){
            synchronized (ReflexSingleton.class){
                if (null == reflexSingleton){
                    reflexSingleton = new ReflexSingleton();//可能会出现重排序问题
                }
            }
        }
        return reflexSingleton;
    }

    /**
     * 解決反序列化带来的创建多个对象问题，使用getInstance方法是为了避免在还没有获取过实例时直接反序列化依然会出现多个对象
     * @return
     */
    private Object readResolve(){
        return getInstance();
    }

}
