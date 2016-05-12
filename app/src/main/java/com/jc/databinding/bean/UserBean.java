package com.jc.databinding.bean;

import java.io.Serializable;

/**
 * Created by jc on 2016-5-12.
 */
public class UserBean implements Serializable {
    public String name;
    public int age;

    public UserBean(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
