package com.sixtwo.creation.prototype;

import com.sixtwo.creation.prototype.deep.Address;
import com.sixtwo.creation.prototype.deep.Student;
import org.junit.Test;

import java.util.concurrent.CountDownLatch;

/**
 * @author zhangshuaifei
 * @description 原型模式与new对象时间测试----不同环境下测试数据会有差异
 *              原型模式：15
 *              new对象：18
 *
 * @date 2019/4/12 10:06
 */
public class EfficiencyCompare {
    //测试饿汉模式
    @Test
    public void testNew() throws Exception{
        //获取线程开始时间
        Long start = System.currentTimeMillis();
        //定义线程数
        int threadNum = 1;
        //
        final CountDownLatch countDownLatch = new CountDownLatch(threadNum);

        for(int i = 0;i<threadNum;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {

                    for(int i=0;i<1000;i++){
                        try{
                            Address address = new Address();
                            Student student = new Student();
                            student.setAddress(address);
                        }catch (Exception e){
                            e.printStackTrace();
                        }
                    }
                    countDownLatch.countDown();
                }
            }).start();
        }
        countDownLatch.await();
        Long end = System.currentTimeMillis();
        System.out.println("new模式时间为："+(end-start));
    }
}
