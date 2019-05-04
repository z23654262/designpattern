package com.sixtwo.behavior.reschain;

/**
 * @author zhangshuaifei
 * @description 经理---处理大于等于3天小于7天的假期
 * @date 2019/4/23 8:34
 */
public class Manager extends NoteHandler{
    @Override
    public void handleRquest(Note note) {
        if(note.getDays()>=3&&note.getDays()<10){
            System.out.println("经理处理"+note.getName()+"的请假------");
        }else{
            super.succesor.handleRquest(note);
        }
    }
}
