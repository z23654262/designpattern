package com.sixtwo.creation.prototype.superficial;

import lombok.*;

import java.util.Date;

/**
 * @author zhangshuaifei
 * @description 浅克隆-----当有关联对象时不会自动克隆
 * @date 2019/3/27 8:37
 */
@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Student implements Prototype{
    private String name;
    private String school;
    private Date birthday;
    private Address address;


    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
