package com.sixtwo.structural.proxy.staticproxy;

/**
 * @author zhangshuaifei
 * @description 商品数据持久化代理类-----用于开启事务
 * @date 2019/4/13 21:09
 */
public class ProductDaoProxy implements ProductDao{

    //真实持久化类
    private ProductDao productDao;

    public ProductDaoProxy(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    public void insertProduct() {
        System.out.println("事务开启");
        productDao.insertProduct();
        System.out.println("事务提交");
    }

    @Override
    public void deleteProduct() {
        System.out.println("事务开启");
        productDao.deleteProduct();
        System.out.println("事务提交");
    }

    @Override
    public void updateProduct() {
        System.out.println("事务开启");
        productDao.updateProduct();
        System.out.println("事务提交");
    }
}
