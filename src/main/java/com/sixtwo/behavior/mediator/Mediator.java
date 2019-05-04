package com.sixtwo.behavior.mediator;

/**
 * @author zhangshuaifei
 * @description 中介者接口---（经理）
 * @date 2019/5/2 18:19
 */
public interface Mediator {
    void register(String name,Department department);
    void command(String name);
}
