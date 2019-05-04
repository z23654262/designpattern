package com.sixtwo.behavior.reschain;

import org.junit.Test;

/**
 * @author zhangshuaifei
 * @description 测试端
 * @date 2019/4/23 8:39
 */
public class Client {
    @Test
    public void test(){
        NoteHandler director = new Director();
        NoteHandler manager = new Manager();
        NoteHandler generalManager = new GeneralManager();
        director.setSuccesor(manager);
        manager.setSuccesor(generalManager);

        Note note = new Note("小张",20);

        director.handleRquest(note);
    }
}
