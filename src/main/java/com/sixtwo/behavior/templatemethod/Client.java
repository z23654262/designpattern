package com.sixtwo.behavior.templatemethod;

import com.sixtwo.behavior.templatemethod.dao.JdbcTemplate;
import com.sixtwo.behavior.templatemethod.dao.UserDao;
import com.sixtwo.behavior.templatemethod.dao.UserDaoImpl;
import com.sixtwo.behavior.templatemethod.entity.User;
import org.junit.Test;

/**
 * @author zhangshuaifei
 * @description 模板方法测试
 * @date 2019/5/4 17:48
 */
public class Client {
    @Test
    public void testInsert(){
        UserDaoImpl userDao = new UserDaoImpl();
        userDao.setJdbcTemplate(new JdbcTemplate());
        int rowCount = userDao.insertUser(new User("z93478462", "zsfiwrn77...", "1119716380@qq.com"));
        System.out.println(rowCount);
    }
    @Test
    public void testDelete(){
        UserDaoImpl userDao = new UserDaoImpl();
        userDao.setJdbcTemplate(new JdbcTemplate());
        int rowCount = userDao.deleteUser(1);
        System.out.println(rowCount);
    }
    @Test
    public void testUpdate(){
        UserDaoImpl userDao = new UserDaoImpl();
        userDao.setJdbcTemplate(new JdbcTemplate());
        int rowCount = userDao.updateUser(new User(1,"z93478462", "zsfiwrn77...1314", "1119716380@qq.com"));
        System.out.println(rowCount);
    }
    @Test
    public void testQuery(){
        UserDaoImpl userDao = new UserDaoImpl();
        userDao.setJdbcTemplate(new JdbcTemplate());
        User user = userDao.getUser(1);
        if(null!=user){
            System.out.println(user);
        }
    }
}
