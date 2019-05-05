package com.sixtwo.behavior.memento;

import java.util.Stack;

/**
 * @author zhangshuaifei
 * @description 用于储存棋子当前状态的前一状态，并提供悔棋操作
 *              只需要提供悔棋操作，不需要提供重做操作，可以使用栈来实现
 * @date 2019/5/5 16:15
 */
public class ChessMementoCaretaker {

    private Stack<ChessMemento> chessMementos;

    public ChessMementoCaretaker() {
        this.chessMementos = new Stack<>();
    }

    public void addChessMemento(ChessMemento chessMemento){
        chessMementos.push(chessMemento);
    }

    public ChessMemento getChessMemento(){
        if(chessMementos.empty()){
            return null;
        }
        return chessMementos.pop();
    }
}
