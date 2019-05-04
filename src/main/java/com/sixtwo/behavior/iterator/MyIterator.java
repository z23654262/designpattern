package com.sixtwo.behavior.iterator;

/***
* @Author zhangshuaifei
* @Description 自定义迭代器接口
* @Date 19:09 2019/5/1
**/
public interface MyIterator<T> {
    T next();
    T first();
    T last();
    T currentItem();
    boolean isFirst();
    boolean isLast();
    boolean hasNext();


}
