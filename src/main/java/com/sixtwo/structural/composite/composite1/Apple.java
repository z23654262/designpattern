package com.sixtwo.structural.composite.composite1;

/**
 * @author zhangshuaifei
 * @description 组件对象----苹果，只能被吃
 * @date 2019/4/16 8:37
 */
public class Apple implements Component{
    @Override
    public void eat() {
        System.out.println("吃苹果");
    }

    @Override
    public void addComponent(Component component) {
        System.err.println("此操作不被支持");
    }

    @Override
    public void removeComponent(Component component) {
        System.err.println("此操作不被支持");
    }

    @Override
    public Component getComponent(int i) {
        System.err.println("此操作不被支持");
        return null;
    }
}
