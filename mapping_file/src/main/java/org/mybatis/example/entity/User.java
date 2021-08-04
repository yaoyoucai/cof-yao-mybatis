package org.mybatis.example.entity;

import java.util.List;

/**
 * @author huanyao
 * @version 1.0
 * @ClassName User.java
 * @Description TODO(用一句话描述该文件做什么)
 * @date 2021/8/4 3:18 下午
 */
public class User {
    private Integer id;
    private String name;
    private List<String> groups;
    private List<String> roles;

    private Card card;
    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    public List<String> getGroups() {
        return groups;
    }

    public void setGroups(List<String> groups) {
        this.groups = groups;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", groups=" + groups +
                ", roles=" + roles +
                '}';
    }
}
