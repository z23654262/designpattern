package com.sixtwo.creation.factory.simplefactory.annotation;

import org.reflections.Reflections;

import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author zhangshuaifei
 * @description 简单工厂模式-----注解+反射：为所有相关对象添加注解，然后通过扫描注解的方式来实现对象实例化
 *              1)扩展性好，没有违反开闭原则
 * @date 2019/4/12 10:43
 */
public class SimpleFactory {

    private Map<String, Class> allCars = new ConcurrentHashMap<String, Class>();

    public Car createCar(String type) throws Exception{
        Reflections reflections = new Reflections("com.sixtwo.creation.factory.simplefactory.annotation");
        Set<Class<?>> annotated = reflections.getTypesAnnotatedWith(CarType.class);
        for (Class<?> classObject : annotated) {
            CarType carType = (CarType) classObject.getAnnotation(CarType.class);
            allCars.put(carType.carType(), classObject);
        }
        allCars = Collections.unmodifiableMap(allCars);
        if(allCars.containsKey(type)){
            return (Car) allCars.get(type).newInstance();
        }else{
            return null;
        }
    }
}
