package com.sixtwo.structural.flyweight;

/**
 * @author zhangshuaifei
 * @description
 * @date 2019/4/30 20:09
 */
public class ConcreteChess implements ChessFlyWeight{
    private String color;

    public ConcreteChess(String color) {
        this.color = color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public void display(Coordinate coordinate) {
        System.out.println(color+"------->X="+coordinate.getX()+",Y="+coordinate.getY());
    }
}
