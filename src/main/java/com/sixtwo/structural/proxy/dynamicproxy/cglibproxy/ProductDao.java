package com.sixtwo.structural.proxy.dynamicproxy.cglibproxy;

/***
* @Author zhangshuaifei
* @Description 商品数据持久化接口
* @Date 21:06 2019/4/13
**/
public interface ProductDao {
    //添加商品
    public void insertProduct();
    //删除商品
    public void deleteProduct();
    //更新商品
    public void updateProduct();
    //查询商品
    public void selectProduct();
}
