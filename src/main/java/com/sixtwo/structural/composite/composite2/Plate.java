package com.sixtwo.structural.composite.composite2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangshuaifei
 * @description 组件对象----盘子，内部可以装盘子或者水果
 * @date 2019/4/16 8:44
 */
public class Plate implements Component {
    //组件对象需要一个能够存放盘子或者水果的空间
    private List<Component> list = new ArrayList<Component>();

    @Override
    public void eat() {
        //盘子的吃方法为遍历该盘子内部的各种组件
        for (Component component:list) {
            //实现递归调用子对象的eat方法
            component.eat();
        }
    }

    public void addComponent(Component component) {
        list.add(component);
    }

    public void removeComponent(Component component) {
        list.remove(component);
    }

    public Component getComponent(int i) {
        return list.get(i);
    }
}
