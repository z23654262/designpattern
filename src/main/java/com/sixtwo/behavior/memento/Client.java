package com.sixtwo.behavior.memento;

import org.junit.Test;

/**
 * @author zhangshuaifei
 * @description 备忘录模式测试类
 * @date 2019/5/5 16:27
 */
public class Client {
    @Test
    public void test(){
        ChessMementoCaretaker caretaker = new ChessMementoCaretaker();

        Chess chess = new Chess("红方棋子",1,1);
        caretaker.addChessMemento(chess.recordState());
        chess.setX(1);
        chess.setY(2);
        caretaker.addChessMemento(chess.recordState());
        chess.setX(2);
        chess.setY(2);

        //悔棋操作
        while(chess.undo(caretaker.getChessMemento())){
            System.out.println("悔棋成功,棋子当前状态为："+chess);
        }
    }
}
