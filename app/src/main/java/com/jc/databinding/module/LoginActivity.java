package com.jc.databinding.module;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.jc.databinding.R;

/**
 * Created by jktaihe on 14/6/17.
 * blog: blog.jktaihe.com
 */

public class LoginActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }


}
