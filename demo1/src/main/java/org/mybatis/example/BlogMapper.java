package org.mybatis.example;

/**
 * @author huanyao
 * @version 1.0
 * @ClassName BlogMapper.java
 * @Description TODO(用一句话描述该文件做什么)
 * @date 2021/7/21 3:38 下午
 */
public interface BlogMapper {
    Blog selectBlog(int id);

    int countBlog();
}
