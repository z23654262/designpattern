package com.sixtwo.behavior.mediator;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhangshuaifei
 * @description 真实中介者类
 * @date 2019/5/2 20:22
 */
public class ConcreteMediator implements Mediator{
    private Map<String,Department> map = new HashMap<>();
    @Override
    public void register(String name, Department department) {
        map.put(name,department);
    }

    @Override
    public void command(String name) {
        map.get(name).selfOperation();
    }
}
