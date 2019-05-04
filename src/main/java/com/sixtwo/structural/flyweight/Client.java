package com.sixtwo.structural.flyweight;

import org.junit.Test;

import java.util.Scanner;

/**
 * @author zhangshuaifei
 * @description 享元模式测试类
 * @date 2019/4/30 16:36
 */
public class Client {
    @Test
    public void test(){
        ChessFlyWeight chess1 = ChessFlyWeightFactory.getChess("黑色");
        ChessFlyWeight chess2 = ChessFlyWeightFactory.getChess("黑色");
        System.out.println(chess1);
        System.out.println(chess2);
        chess1.display(new Coordinate(1,1));
        chess2.display(new Coordinate(2,2));
    }

}
