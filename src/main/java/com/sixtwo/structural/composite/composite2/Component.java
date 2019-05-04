package com.sixtwo.structural.composite.composite2;

/***
* @Author zhangshuaifei
* @Description 组件接口：只将叶子对象和组合对象的公有方法提取到接口中
 *             1）优点：叶子对象中没有不必要方法
 *             2）缺点：使用时需要区分对象，使用不便
* @Date 8:36 2019/4/16
**/

public interface Component {
    /*default void add(){
        //默认实现方法  JDK1.8+才能使用
    }*/
    void eat();
}
