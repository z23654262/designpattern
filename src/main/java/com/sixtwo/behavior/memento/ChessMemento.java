package com.sixtwo.behavior.memento;

/**
 * @author zhangshuaifei
 * @description 棋子备忘录----用于存储一枚棋子某一时刻的状态
 *              在拷贝对象状态时可使用原型模式
 * @date 2019/5/5 16:14
 */
public class ChessMemento {
    private Chess chess;

    @Override
    public String toString() {
        return "ChessMemento{" +
                "chess=" + chess +
                '}';
    }

    public ChessMemento(Chess chess) {
        try {
            this.chess = (Chess) chess.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    public Chess getChess() {
        return chess;
    }
}
