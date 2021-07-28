package org.mybatis.example;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author huanyao
 * @version 1.0
 * @ClassName Blog.java
 * @Description Blog实体类
 * @date 2021/7/21 3:38 下午
 */
@Data
@AllArgsConstructor
public class Blog {
    private int id;
    private String name;
}
