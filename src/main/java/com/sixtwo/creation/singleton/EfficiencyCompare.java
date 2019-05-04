package com.sixtwo.creation.singleton;

import com.sixtwo.creation.singleton.early.EarlySingleton;
import com.sixtwo.creation.singleton.enummodel.EnumSingleton;
import com.sixtwo.creation.singleton.lazy.LazySingleton;
import com.sixtwo.creation.singleton.staticclass.StaticClassSingleton;
import org.junit.Test;

import java.util.concurrent.CountDownLatch;

/**
 * @author zhangshuaifei
 * @description 各种模式时间测试----不同环境下测试数据会有差异
 *              饿汉模式：33
 *              懒汉模式：123
 *              静态内部类：25
 *              枚举：31
 *
 *              使用延迟加载：静态内部类优于懒汉模式
 *              不使用延迟加载：枚举优于饿汉模式
 * @date 2019/4/12 10:06
 */
public class EfficiencyCompare {
    //测试饿汉模式
    @Test
    public void testEarly() throws Exception{
        //获取线程开始时间
        Long start = System.currentTimeMillis();
        //定义线程数
        int threadNum = 10;
        //
        final CountDownLatch countDownLatch = new CountDownLatch(threadNum);

        for(int i = 0;i<threadNum;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for(int i=0;i<10000000;i++){
                        Object o = EarlySingleton.getInstance();
                    }
                    countDownLatch.countDown();
                }
            }).start();
        }
        countDownLatch.await();
        Long end = System.currentTimeMillis();
        System.out.println("饿汉模式时间为："+(end-start));
    }

    //测试懒汉模式
    @Test
    public void testLazy() throws Exception{
        //获取线程开始时间
        Long start = System.currentTimeMillis();
        //定义线程数
        int threadNum = 10;
        //
        final CountDownLatch countDownLatch = new CountDownLatch(threadNum);

        for(int i = 0;i<threadNum;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for(int i=0;i<10000000;i++){
                        Object o = LazySingleton.getInstance();
                    }
                    countDownLatch.countDown();
                }
            }).start();
        }
        countDownLatch.await();
        Long end = System.currentTimeMillis();
        System.out.println("懒汉模式时间为："+(end-start));
    }

    //测试静态内部类
    @Test
    public void testStaticClass() throws Exception{
        //获取线程开始时间
        Long start = System.currentTimeMillis();
        //定义线程数
        int threadNum = 10;
        //
        final CountDownLatch countDownLatch = new CountDownLatch(threadNum);

        for(int i = 0;i<threadNum;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for(int i=0;i<10000000;i++){
                        Object o = StaticClassSingleton.getInstance();
                    }
                    countDownLatch.countDown();
                }
            }).start();
        }
        countDownLatch.await();
        Long end = System.currentTimeMillis();
        System.out.println("静态内部类模式时间为："+(end-start));
    }

    //测试枚举
    @Test
    public void testEnum() throws Exception{
        //获取线程开始时间
        Long start = System.currentTimeMillis();
        //定义线程数
        int threadNum = 10;
        //
        final CountDownLatch countDownLatch = new CountDownLatch(threadNum);

        for(int i = 0;i<threadNum;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for(int i=0;i<10000000;i++){
                        Object o = EnumSingleton.INSTANCE;
                    }
                    countDownLatch.countDown();
                }
            }).start();
        }
        countDownLatch.await();
        Long end = System.currentTimeMillis();
        System.out.println("枚举模式时间为："+(end-start));
    }
}
