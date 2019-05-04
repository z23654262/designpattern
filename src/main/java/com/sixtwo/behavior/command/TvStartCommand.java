package com.sixtwo.behavior.command;

/**
 * @author zhangshuaifei
 * @description 电视机开启命令
 * @date 2019/5/4 15:37
 */
public class TvStartCommand extends Command{
    public TvStartCommand(Tv tv) {
        super.tv = tv;
        super.commandName = "startTv";
    }

    @Override
    public void execute() {
        super.tv.start();
    }
}
