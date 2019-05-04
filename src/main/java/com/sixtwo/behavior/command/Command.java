package com.sixtwo.behavior.command;

/**
 * @author zhangshuaifei
 * @description 命令接口----对电视机的命令
 * @date 2019/5/4 15:28
 */
public abstract class Command {
    protected Tv tv;

    protected String commandName;

    public abstract void execute();
}
