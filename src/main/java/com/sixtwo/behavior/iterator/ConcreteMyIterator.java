package com.sixtwo.behavior.iterator;

import java.util.List;

/**
 * @author zhangshuaifei
 * @description 自定义迭代器
 * @date 2019/5/1 19:13
 */
public class ConcreteMyIterator implements MyIterator{
    private List list;
    private int cursor;

    public ConcreteMyIterator(List list) {
        //System.out.println("默认游标为："+cursor);
        this.list = list;
    }

    @Override
    public Object next() {
        if(cursor<list.size()){
            cursor++;
        }
        return currentItem();
    }

    @Override
    public Object first() {
        cursor = 0;
        return currentItem();
    }

    @Override
    public Object last() {
        cursor = list.size()-1;
        return currentItem();
    }

    @Override
    public Object currentItem() {
        return list.get(cursor);
    }

    @Override
    public boolean isFirst() {
        return cursor==0?true:false;
    }

    @Override
    public boolean isLast() {
        return cursor==list.size()-1?true:false;
    }

    @Override
    public boolean hasNext() {
        return cursor<list.size()-1?true:false;
    }
}
