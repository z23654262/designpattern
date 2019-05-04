package com.sixtwo.creation.singleton.lazy;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author zhangshuaifei
 * @description 懒汉单例模式测试
 * @date 2019/3/27 8:17
 */
public class Client {
    //测试懒汉单例模式
    @Test
    public void test1(){
        LazySingleton instance1 = LazySingleton.getInstance();
        LazySingleton instance2 = LazySingleton.getInstance();
        System.out.println(instance1 == instance2);//true
    }

    //测试序列化
    @Test
    public void testSerializable() throws Exception{
        LazySingleton lazySingleton = LazySingleton.getInstance();

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("F:\\fileupload\\a.txt"));

        oos.writeObject(lazySingleton);
        oos.flush();
        oos.close();
    }

    //测试反序列化
    @Test
    public void testDeSerializable() throws Exception{
        //首先反序列化
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("F:\\fileupload\\a.txt"));

        LazySingleton lazySingleton1 = (LazySingleton) ois.readObject();

        ois.close();
        //单例获取对象实例

        LazySingleton instance = LazySingleton.getInstance();

        System.out.println(instance == lazySingleton1);//true

    }
}
