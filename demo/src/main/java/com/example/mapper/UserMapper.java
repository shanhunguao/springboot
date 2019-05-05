package com.example.mapper;

/**
 * @author zhouhuangfan
 * @data 2019-5-5 0005
 */

import com.example.entity.User;
import org.springframework.stereotype.Repository;
@Repository
public interface UserMapper {
    /**访问数据库*/
    User sel(int id);
}
