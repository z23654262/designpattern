package com.sixtwo.behavior.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangshuaifei
 * @description
 * @date 2019/5/1 19:18
 */
public class ConcreteMyAggregate implements MyAggregate{
    private List<Object> list = new ArrayList<>();

    @Override
    public MyIterator createIterator() {
        return new ConcreteMyIterator(list);
    }

    @Override
    public void add(Object o) {
        list.add(o);
    }

    @Override
    public Object get(int index) {
        return list.get(index);
    }
}
