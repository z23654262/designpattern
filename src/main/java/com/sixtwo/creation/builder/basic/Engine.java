package com.sixtwo.creation.builder.basic;

/**
 * @author zhangshuaifei
 * @description 发动机
 * @date 2019/4/12 21:39
 */
public class Engine {
    private String name;

    public Engine(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Engine{" +
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
