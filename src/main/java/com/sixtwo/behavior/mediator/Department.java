package com.sixtwo.behavior.mediator;

/**
 * @author zhangshuaifei
 * @description 被中介管理的接口-----（部门）
 * @date 2019/5/2 18:51
 */
public interface Department {
    void selfOperation();
    void outOperation();//可添加多个
}
