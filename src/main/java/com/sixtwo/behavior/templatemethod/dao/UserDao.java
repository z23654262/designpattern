package com.sixtwo.behavior.templatemethod.dao;

import com.sixtwo.behavior.templatemethod.entity.User;

/**
 * @author zhangshuaifei
 * @description 数据操作接口
 * @date 2019/5/4 17:35
 */
public interface UserDao {
    int insertUser(User user);
    int updateUser(User user);
    int deleteUser(int id);
    User getUser(int id);
}
