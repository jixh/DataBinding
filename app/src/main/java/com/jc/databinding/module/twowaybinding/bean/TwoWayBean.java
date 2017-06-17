package com.jc.databinding.module.twowaybinding.bean;

import android.databinding.ObservableField;

/**
 * Created by jktaihe on 17/6/17.
 * blog: blog.jktaihe.com
 */

public class TwoWayBean {

    public ObservableField<String> itemName = new ObservableField<>();
    public ObservableField<Boolean> isItemChecked = new ObservableField<>();

    public TwoWayBean(String itemName) {
        this.itemName.set(itemName);
    }
}
