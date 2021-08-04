package org.mybatis.example.mapper;

import org.apache.ibatis.cursor.Cursor;
import org.mybatis.example.entity.User;

import java.util.List;

/**
 * @author huanyao
 * @version 1.0
 * @ClassName BlogMapper.java
 * @Description TODO(用一句话描述该文件做什么)
 * @date 2021/7/21 3:38 下午
 */
public interface UserMapper {
    List<User> getAllUsers();

    User queryById(int userId);
}
