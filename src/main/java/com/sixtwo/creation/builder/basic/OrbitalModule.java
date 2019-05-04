package com.sixtwo.creation.builder.basic;

/***
* @Author zhangshuaifei
* @Description 轨道舱
* @Date 21:36 2019-04-12
**/
public class OrbitalModule{
    private String name;

    public OrbitalModule(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "OrbitalModule{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
