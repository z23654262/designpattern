package com.sixtwo.behavior.templatemethod.utils;

import com.mysql.jdbc.Driver;

import java.sql.*;

/**
 * @author zhangshuaifei
 * @description 数据连接建立工具类
 * @date 2019/5/4 17:16
 */
public class JdbcUtil {
    private static String url = "jdbc:mysql://localhost:3306/springbootdata";
    private static String user = "root";
    private static String password = "123456";
    static {
        try {
            DriverManager.registerDriver(new Driver());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static Connection getConnection(){
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url,user,password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
    public static void free(Connection connection,PreparedStatement statement){
        if(null!=connection){
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(null!=statement){
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    public static void free(Connection connection, PreparedStatement statement, ResultSet resultSet){
        free(connection,statement);
        if(null!=resultSet){
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
