package com.sixtwo.behavior.templatemethod.dao;

import java.sql.ResultSet;

/**
 * @author zhangshuaifei
 * @description 用于处理ResultSet与实体类之间的数据映射
 * @date 2019/5/4 17:43
 */
public interface RowMapper {
    public abstract <T> T extractResult(ResultSet rs);
}
