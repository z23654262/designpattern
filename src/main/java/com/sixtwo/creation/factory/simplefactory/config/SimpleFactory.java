package com.sixtwo.creation.factory.simplefactory.config;

import java.io.IOException;
import java.util.Properties;

/**
 * @author zhangshuaifei
 * @description 简单工厂模式-----配置文件+反射：将所有有关对象的配置信息保存到文件中
 *              1)扩展性好，没有违反开闭原则
 * @date 2019/4/12 10:43
 */
public class SimpleFactory {

    public Car createCar(String type) throws Exception{
        Properties prop = new Properties();
        try {
            //加载配置文件
            prop.load(SimpleFactory.class.getResourceAsStream("car.properties"));
        } catch (IOException e) {
            System.out.println("读取配置文件失败！");
            throw new RuntimeException(e);
        }
        return (Car) Class.forName(prop.getProperty(type)).newInstance();
    }
}
