package com.sixtwo.behavior.command;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhangshuaifei
 * @description 遥控器
 * @date 2019/5/4 15:37
 */
public class Controller {
    private Map<String,Command> commands = new HashMap<>();

    public void addCommand(Command command){
        commands.put(command.commandName,command);
    }
    public void execute(String commandName){
        Command command = commands.get(commandName);
        if(null!=command){
            command.execute();
        }else{
            System.out.println("遥控器没有该功能！");
        }
    }
}
