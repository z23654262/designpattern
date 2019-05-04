package com.sixtwo.behavior.command;

import org.junit.Test;

import java.util.Map;

/**
 * @author zhangshuaifei
 * @description 命令模式测试类
 * @date 2019/5/4 15:45
 */
public class Client {
    @Test
    public void test(){
        Tv tv = new Tv("我家的电视机");

        Controller controller = new Controller();

        controller.addCommand(new TvCloseCommand(tv));
        controller.addCommand(new TvStartCommand(tv));
        controller.addCommand(new TvChangeCommand(tv));

        controller.execute("startTv");
        controller.execute("closeTv");
        controller.execute("changeTv");
    }
}
