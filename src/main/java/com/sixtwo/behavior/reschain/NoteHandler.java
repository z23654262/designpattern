package com.sixtwo.behavior.reschain;

/**
 * @author zhangshuaifei
 * @description 请假责任链
 * @date 2019/4/23 8:30
 */
public abstract class NoteHandler {
    protected NoteHandler succesor;

    public void setSuccesor(NoteHandler succesor) {
        this.succesor = succesor;
    }

    public abstract void handleRquest(Note note);
}
