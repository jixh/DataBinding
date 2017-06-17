package com.jc.databinding.module.twowaybinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import com.jc.databinding.R;
import com.jc.databinding.databinding.LayoutBindingBinding;
import com.jc.databinding.module.twowaybinding.bean.TwoWayBean;

/**
 * Created by jktaihe on 17/6/17.
 * blog: blog.jktaihe.com
 */

public class TwoWayBindingPage extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LayoutBindingBinding binding = DataBindingUtil.setContentView(this, R.layout.layout_binding);
        TwoWayBean itemBean = new TwoWayBean("tiem");
        binding.setItem(itemBean);
    }
}
