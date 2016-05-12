package com.jc.databinding.bean;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.jc.databinding.BR;

/**
 * Created by jc on 2016-5-12.
 *
 */
public class ObservableUserBean extends BaseObservable {

    public String name;
    public int age;

    public ObservableUserBean(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

    @Bindable
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        notifyPropertyChanged(BR.age);
    }
}
