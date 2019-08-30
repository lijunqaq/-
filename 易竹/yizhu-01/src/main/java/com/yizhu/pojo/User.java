package com.yizhu.pojo;

/**
 * 功能描述
 *
 * @author 10773
 * @date 2019/6/19
 */
public class User {
    private String name;
    private String desc;

    public User(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
