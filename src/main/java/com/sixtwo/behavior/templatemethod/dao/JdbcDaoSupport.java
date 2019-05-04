package com.sixtwo.behavior.templatemethod.dao;

/**
 * @author zhangshuaifei
 * @description 继承本类即可实现模板的使用
 * @date 2019/5/4 17:47
 */
public class JdbcDaoSupport {
    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
