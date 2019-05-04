package com.sixtwo.creation.prototype.deep;

import lombok.*;

import java.util.Date;

/**
 * @author zhangshuaifei
 * @description 深克隆-----当有关联对象时手动将关联对象克隆
 * @date 2019/3/27 8:37
 */
@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Student implements Prototype {
    private String name;
    private String school;
    private Date birthday;
    private Address address;


    @Override
    public Object clone() throws CloneNotSupportedException{
        Object clone = super.clone();

        //添加代码实现深克隆
        Student student = (Student) clone;
        student.setAddress((Address) student.getAddress().clone());

        return student;
    }
}
