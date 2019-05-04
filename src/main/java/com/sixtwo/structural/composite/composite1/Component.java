package com.sixtwo.structural.composite.composite1;

/***
* @Author zhangshuaifei
* @Description 组件接口：将所有方法都提取到接口中
 *             1）优点：不用区分组件对象和叶子对象，使用方便
 *             2）缺点：叶子对象中多了不必要的方法
 *             JDK1.8+以后可在接口中实现方法体，前面需要添加default关键词
* @Date 8:36 2019/4/16
**/

public interface Component {
    /*default void add(){
        //默认实现方法  JDK1.8+才能使用
    }*/
    void eat();
    void addComponent(Component component);
    void removeComponent(Component component);
    Component getComponent(int i);
}
