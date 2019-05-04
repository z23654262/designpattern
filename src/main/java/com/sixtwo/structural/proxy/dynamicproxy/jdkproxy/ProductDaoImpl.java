package com.sixtwo.structural.proxy.dynamicproxy.jdkproxy;

/**
 * @author zhangshuaifei
 * @description 商品数据持久化类
 * @date 2019/4/13 21:08
 */
public class ProductDaoImpl implements ProductDao {
    @Override
    public void insertProduct() {
        System.out.println("添加商品");
    }

    @Override
    public void deleteProduct() {
        System.out.println("删除商品");
    }

    @Override
    public void updateProduct() {
        System.out.println("更新商品");
    }

    @Override
    public void selectProduct() {
        System.out.println("查询商品");
    }
}
