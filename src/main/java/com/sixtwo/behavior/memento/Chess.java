package com.sixtwo.behavior.memento;

/**
 * @author zhangshuaifei
 * @description 下棋的棋子类----使用备忘录模式来实现下棋时的悔棋操作
 *              通过原型模式实现状态的快速拷贝
 * @date 2019/5/5 16:12
 */
public class Chess implements Prototype{
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    private String chessName;
    private int x,y;

    //进行备忘操作，返回棋子备忘录
    public ChessMemento recordState(){
        return new ChessMemento(this);
    }

    //进行悔棋操作，传入棋子备忘录，将棋子状态改变
    public boolean undo(ChessMemento chessMemento){
        if(null==chessMemento) return false;
        this.chessName=chessMemento.getChess().getChessName();
        this.x=chessMemento.getChess().getX();
        this.y=chessMemento.getChess().getY();
        return true;
    }

    public Chess() {
    }

    public Chess(String chessName, int x, int y) {
        this.chessName = chessName;
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Chess{" +
                "chessName='" + chessName + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }

    public String getChessName() {
        return chessName;
    }

    public void setChessName(String chessName) {
        this.chessName = chessName;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
