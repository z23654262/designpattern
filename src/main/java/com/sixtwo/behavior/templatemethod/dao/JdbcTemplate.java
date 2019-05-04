package com.sixtwo.behavior.templatemethod.dao;

import com.sixtwo.behavior.templatemethod.utils.JdbcUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author zhangshuaifei
 * @description 数据访问模板---------数据增删改  查（单个信息查询）
 * @date 2019/5/4 17:37
 */
public class JdbcTemplate {
    public int sqlUpdate(String sql,Object... params){
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = JdbcUtil.getConnection();
            statement = connection.prepareStatement(sql);
            for (int i = 0; i < params.length; i++) {
                statement.setObject(i+1,params[i]);
            }
            int rowCount = statement.executeUpdate();
            return rowCount;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtil.free(connection,statement);
        }
        return 0;
    }
    public <T> T queryForObject(String sql, RowMapper rowMapper,Object... params){
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet rs = null;
        try {
            connection = JdbcUtil.getConnection();
            statement = connection.prepareStatement(sql);
            for (int i = 0; i < params.length; i++) {
                statement.setObject(i+1,params[i]);
            }
            //结果集返回
            rs= statement.executeQuery();
            //处理数据映射，可采用匿名内部类的方式
            return rowMapper.extractResult(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtil.free(connection,statement,rs);
        }
        return null;
    }
}
