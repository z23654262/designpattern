package com.sixtwo.creation.builder.basic;

/**
 * @author zhangshuaifei
 * @description 逃逸塔
 * @date 2019/4/12 21:40
 */
public class EscapeTower {
    private String name;

    public EscapeTower(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "EscapeTower{" +
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
