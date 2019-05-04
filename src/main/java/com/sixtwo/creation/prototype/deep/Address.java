package com.sixtwo.creation.prototype.deep;

import lombok.*;

/**
 * @author zhangshuaifei
 * @description
 * @date 2019/4/12 22:45
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Address implements Prototype{
    private String province;
    private String city;
    private String area;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
