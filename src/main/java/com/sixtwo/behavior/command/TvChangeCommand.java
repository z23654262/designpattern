package com.sixtwo.behavior.command;

/**
 * @author zhangshuaifei
 * @description
 * @date 2019/5/4 15:49
 */
public class TvChangeCommand extends Command {
    public TvChangeCommand(Tv tv) {
        super.tv = tv;
        super.commandName = "changeTv";
    }

    @Override
    public void execute() {
        super.tv.change();
    }
}
