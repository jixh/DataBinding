package com.jc.databinding.module.listview.bean;

import java.io.Serializable;

/**
 * Created by jktaihe on 17/6/17.
 * blog: blog.jktaihe.com
 */

public class ItemHeaderBean implements Serializable {
    public String name;
    public int age;

    public ItemHeaderBean(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "ItemHeaderBean{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
