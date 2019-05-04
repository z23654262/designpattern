package com.sixtwo.behavior.iterator;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @author zhangshuaifei
 * @description 迭代器测试类
 * @date 2019/5/1 17:59
 */
public class Client {

    @Test
    public void test(){
        MyAggregate<String> myAggregate = new ConcreteMyAggregate();
        myAggregate.add("aaa");
        myAggregate.add("bbb");
        myAggregate.add("ccc");
        MyIterator iterator = myAggregate.createIterator();
        System.out.println(iterator.first());
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    @Test
    public void test2(){
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        Iterator<String> iterator = list.iterator();
    }
}
