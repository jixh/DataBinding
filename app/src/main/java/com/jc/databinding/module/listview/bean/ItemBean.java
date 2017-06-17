package com.jc.databinding.module.listview.bean;

import android.view.View;
import android.widget.Toast;

import java.io.Serializable;

/**
 * Created by jc on 2016-5-12.
 */
public class ItemBean implements Serializable {
    public String name;
    public int age;
    public String url;

    public ItemBean(String name, int age) {
        this(name,age,null);
    }

    public ItemBean(String name, int age , String url) {
        this.name = name;
        this.age = age;
        this.url = url;
    }


    public void onItemClicker(View view){
        Toast.makeText(view.getContext(),name,Toast.LENGTH_SHORT).show();
    }

    @Override
    public String toString() {
        return "ItemBean{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", url='" + url + '\'' +
                '}';
    }
}
