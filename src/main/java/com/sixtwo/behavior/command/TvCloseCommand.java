package com.sixtwo.behavior.command;

/**
 * @author zhangshuaifei
 * @description 电视机关闭命令
 * @date 2019/5/4 15:29
 */
public class TvCloseCommand extends Command{

    public TvCloseCommand(Tv tv) {
        super.tv = tv;
        super.commandName = "closeTv";
    }

    @Override
    public void execute() {
        super.tv.close();
    }
}
