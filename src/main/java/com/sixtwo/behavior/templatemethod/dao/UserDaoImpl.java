package com.sixtwo.behavior.templatemethod.dao;

import com.sixtwo.behavior.templatemethod.entity.User;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author zhangshuaifei
 * @description 数据访问具体实现
 * @date 2019/5/4 17:48
 */
public class UserDaoImpl extends JdbcDaoSupport implements UserDao{
    @Override
    public int insertUser(User user) {
        return getJdbcTemplate().sqlUpdate("insert into tbl_user (username,password,email) values(?,?,?)",user.getUsername(),user.getPassword(),user.getEmail());
    }

    @Override
    public int updateUser(User user) {
        return getJdbcTemplate().sqlUpdate("update tbl_user set username=?,password=?,email=? where id = ?",user.getUsername(),user.getPassword(),user.getEmail(),user.getId());
    }

    @Override
    public int deleteUser(int id) {
        return getJdbcTemplate().sqlUpdate("delete from tbl_user where id = ?",id);
    }

    @Override
    public User getUser(int id) {
        return getJdbcTemplate().queryForObject("select * from tbl_user where id = ?", new RowMapper() {
            @Override
            public <T> T extractResult(ResultSet rs) {
                try {
                    if(rs.next()){
                        User user = new User();
                        user.setId(rs.getInt("id"));
                        user.setUsername(rs.getString("username"));
                        user.setPassword(rs.getString("password"));
                        user.setEmail(rs.getString("email"));
                        return (T) user;
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                return null;
            }
        }, id);
    }
}
