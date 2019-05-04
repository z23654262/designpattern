package com.sixtwo.behavior.command;

/**
 * @author zhangshuaifei
 * @description 模拟信号接收者----电视
 * @date 2019/5/4 15:25
 */
public class Tv {
    private String name;

    public Tv(String name) {
        this.name = name;
    }

    public void start() {
        System.out.println(name + "启动");
    }

    public void close() {
        System.out.println(name + "关闭");
    }
    public void change() {
        System.out.println(name + "调频道");
    }

}
