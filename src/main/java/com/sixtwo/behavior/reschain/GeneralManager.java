package com.sixtwo.behavior.reschain;

/**
 * @author zhangshuaifei
 * @description 总经理-----处理大于等于10天小于30天的假期
 * @date 2019/4/23 8:36
 */
public class GeneralManager extends NoteHandler{
    @Override
    public void handleRquest(Note note) {
        if(note.getDays()>=10&&note.getDays()<30){
            System.out.println("总经理处理"+note.getName()+"的请假-------");
        }else{
            System.out.println("请假被驳回--");
        }
    }
}
