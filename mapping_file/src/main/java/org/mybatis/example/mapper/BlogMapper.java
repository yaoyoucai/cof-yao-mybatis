package org.mybatis.example.mapper;

import org.mybatis.example.Blog;

import java.util.HashMap;
import java.util.List;

/**
 * @author huanyao
 * @version 1.0
 * @ClassName BlogMapper.java
 * @Description TODO(用一句话描述该文件做什么)
 * @date 2021/7/21 3:38 下午
 */
public interface BlogMapper {
    Blog selectBlog(int id);

    HashMap<String,Object> selectBlogMap(int id);

    /**
     * 查询所有blog数据
     */
    List<Blog> selectBlogs();

    int countBlog();

    /**
     * 插入blog
     */
    void insertBlog(Blog blog);
}
