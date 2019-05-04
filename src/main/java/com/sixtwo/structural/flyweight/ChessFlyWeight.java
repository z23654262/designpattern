package com.sixtwo.structural.flyweight;

/**
 * @author zhangshuaifei
 * @description
 * @date 2019/4/30 20:05
 */
public interface ChessFlyWeight {
    void setColor(String color);
    String getColor();
    void display(Coordinate coordinate);
}

