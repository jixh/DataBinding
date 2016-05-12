package com.jc.databinding.bean;

import android.databinding.ObservableField;
import android.databinding.ObservableInt;

/**
 * Created by jc on 2016-5-12.
 * Data Binding Library提供了很便利的类ObservableField，还有ObservableBoolean, ObservableByte, ObservableChar, ObservableShort, ObservableInt, ObservableLong, ObservableFloat, ObservableDouble, 和 ObservableParcelable，
 * 基本上涵盖了各种我们需要的类型
 */
public class WrapUserBean {
    public final ObservableField<String> name = new ObservableField<>();
    public final ObservableInt age = new ObservableInt();

    public WrapUserBean() {
    }

    public WrapUserBean(String name,int age){
        this.name.set(name);
        this.age.set(age);
    }
}
