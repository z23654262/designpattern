package com.sixtwo.behavior.strategy;

/**
 * @author zhangshuaifei
 * @description 策略接口-------顾客打折策略   新客户大小批量，老客户大小批量  分别对应原价、九折、八五折、八折
 * @date 2019/5/4 20:01
 */
public interface Strategy {
    double getPrice(double standardPrice);
}
