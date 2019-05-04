package com.sixtwo.creation.prototype.superficial;

import org.junit.Test;

import java.util.Date;

/**
 * @author zhangshuaifei
 * @description
 * @date 2019/3/27 8:40
 */
public class Client {
    @Test
    public void test1() throws CloneNotSupportedException{
        Address address = new Address("河南省","郑州市","广惠街");
        Student student1 = new Student("张三","南阳理工学院",new Date(1234564654L),address);
        Student student2 = (Student) student1.clone();
        System.out.println(student1.getAddress());
        address.setProvince("不是河南省");
        System.out.println(student1.getAddress());
        //浅拷贝，当student1的address属性修改后student2的address属性也跟着进行了修改
        System.out.println(student2.getAddress());
    }
}
