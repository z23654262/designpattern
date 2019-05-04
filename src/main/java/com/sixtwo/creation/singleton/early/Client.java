package com.sixtwo.creation.singleton.early;

import org.junit.Test;

import java.io.*;

/**
 * @author zhangshuaifei
 * @description  测试类
 * @date 2019/4/11 21:03
 */
public class Client {

    /***
    * @Author zhangshuaifei
    * @Description 测试单例模式饿汉模式
    * @Date 8:45 2019/4/12
    **/
    @Test
    public void test1(){
        EarlySingleton instance = EarlySingleton.getInstance();

        EarlySingleton instance2 = EarlySingleton.getInstance();

        System.out.println(instance == instance2);//true
    }
    
    /***
    * @Author zhangshuaifei
    * @Description 测试饿汉模式下序列化问题
    * @Date 8:44 2019/4/12
    **/
    
    /***
    * @Author zhangshuaifei
    * @Description 测试序列化
    * @Date 8:52 2019/4/12
    **/
    @Test
    public void test2() throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("F:/fileupload/b.txt"));

        EarlySingleton instance = EarlySingleton.getInstance();

        oos.writeObject(instance);

        oos.flush();
        oos.close();
    }

    /***
    * @Author zhangshuaifei
    * @Description 测试反序列化结果是否符合单例
    * @Date 8:54 2019/4/12
    **/
    @Test
    public void test3() throws IOException,ClassNotFoundException{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("F:/fileupload/b.txt"));

        EarlySingleton earlySingleton = (EarlySingleton) ois.readObject();

        ois.close();

        EarlySingleton instance = EarlySingleton.getInstance();

        System.out.println(earlySingleton == instance);//未重写单例类的readResolve方法时是false
    }

}
