package com.sixtwo.creation.factory.simplefactory.basic;

/**
 * @author zhangshuaifei
 * @description 简单工厂模式：将所有有关对象的创建职责全部交给一个工厂
 *              1)违反了开闭原则(ocp)：对扩展开放，对修改关闭---简单工厂扩展功能困难
 * @date 2019/4/12 10:43
 */
public class SimpleFactory {

    public Car createCar(String type) {
        // switch中如果传入的是String，必须是jdk1.7+
        switch (type) {
            case "奥迪":
                return new Audi();
            case "比亚迪":
                return new Byd();
            default:
                return null;
        }
    }
}
