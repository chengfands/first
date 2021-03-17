package com.cf.serializable;

import java.io.Serializable;

/**
 * 游戏
 * @author chengfan
 * @date 2019-10-23 14:25:17
 */
public class Game implements Serializable {

    /**
     * 游戏名称
     */
    private String name;
    /**
     * 游戏描述
     */
    private String description;
    /**
     * 游戏寿命
     */
    private transient Integer age;

    public Game(String name, String description, Integer age) {
        this.name = name;
        this.description = description;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
