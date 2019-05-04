package com.sixtwo.behavior.iterator;

import java.util.List;

/**
 * @author zhangshuaifei
 * @description 自定义聚合接口-----相当于List
 * @date 2019/5/1 19:14
 */
public interface MyAggregate<T> {
    void add(T t);
    T get(int index);
    MyIterator createIterator();
}
