package com.sixtwo.behavior.reschain;

/**
 * @author zhangshuaifei
 * @description 请假条
 * @date 2019/4/23 8:28
 */
public class Note {
    private String name;
    private int days;

    public Note(String name, int days) {
        this.name = name;
        this.days = days;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
