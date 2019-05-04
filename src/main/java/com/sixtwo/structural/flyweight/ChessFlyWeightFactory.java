package com.sixtwo.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhangshuaifei
 * @description 享元工厂---最重要
 * @date 2019/4/30 20:14
 */
public class ChessFlyWeightFactory {
    private static Map<String,ChessFlyWeight> map = new HashMap<>();

    public static ChessFlyWeight getChess(String color){
        ChessFlyWeight chess = map.get(color);
        if(chess !=null){
            return chess;
        }else{
            ChessFlyWeight chessFlyWeight = new ConcreteChess(color);
            map.put(color,chessFlyWeight);
            return chessFlyWeight;
        }
    }
}
