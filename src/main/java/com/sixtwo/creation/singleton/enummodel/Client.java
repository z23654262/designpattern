package com.sixtwo.creation.singleton.enummodel;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author zhangshuaifei
 * @description 枚举单例模式测试
 * @date 2019/4/12 9:22
 */
public class Client {
    //测试枚举单例模式
    @Test
    public void test1(){
        EnumSingleton instance1 = EnumSingleton.INSTANCE;
        EnumSingleton instance2 = EnumSingleton.INSTANCE;
        System.out.println(instance1 == instance2);
    }
    //测试序列化
    @Test
    public void testSerializable() throws Exception{
        EnumSingleton enumSingleton = EnumSingleton.INSTANCE;

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("F:\\fileupload\\c.txt"));

        oos.writeObject(enumSingleton);
        oos.flush();
        oos.close();
    }

    //测试反序列化
    @Test
    public void testDeSerializable() throws Exception{
        //首先反序列化
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("F:\\fileupload\\c.txt"));

        EnumSingleton enumSingleton1 = (EnumSingleton) ois.readObject();

        ois.close();
        //枚举获取对象实例

        EnumSingleton instance = EnumSingleton.INSTANCE;

        System.out.println(instance == enumSingleton1);//true

    }
}
