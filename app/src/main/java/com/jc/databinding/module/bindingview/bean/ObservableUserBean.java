package com.jc.databinding.module.bindingview.bean;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.Observable;
import android.util.Log;

import com.jc.databinding.BR;


/**
 * Created by jc on 2016-5-12.
 *实体类继承BaseObservable，或者自己实现Observable
 在需要刷新的属性的get方法上添加@Bindable注解，此时会自动生成BR类。（这里有个坑，很多时候BR文件不会自动生成，此时需要重启AS...请让我先默默地日一波dog）
 在相应的set方法里调用notifyPropertyChanged(BR.xxx)进行刷新。
 */

public class ObservableUserBean extends BaseObservable {

    public String name;
    public int age;

    public ObservableUserBean(String name, int age) {
        this.name = name;
        this.age = age;

        //当属性值变化时的回调。
        this.addOnPropertyChangedCallback(new OnPropertyChangedCallback() {
            @Override
            public void onPropertyChanged(Observable observable, int propertyId) {
                Log.i(getClass().getSimpleName(),""+propertyId);
            }
        });
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
