package com.sixtwo.behavior.reschain;

/**
 * @author zhangshuaifei
 * @description 主任-----责任链的头（处理小于3天的假期）
 * @date 2019/4/23 8:30
 */
public class Director extends NoteHandler{

    @Override
    public void handleRquest(Note note) {
        if(note.getDays()<3){
            System.out.println("主任处理"+note.getName()+"请假------");
        }else{
           super.succesor.handleRquest(note);
        }
    }
}
