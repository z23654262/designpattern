package com.sixtwo.structural.composite.composite2;

/**
 * @author zhangshuaifei
 * @description 组件对象----苹果，只能被吃
 * @date 2019/4/16 8:37
 */
public class Apple implements Component {
    @Override
    public void eat() {
        System.out.println("吃苹果");
    }
}
