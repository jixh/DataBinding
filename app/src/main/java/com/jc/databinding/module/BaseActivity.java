package com.jc.databinding.module;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by jktaihe on 14/6/17.
 * blog: blog.jktaihe.com
 */

public class BaseActivity extends AppCompatActivity {


    public static void startActivity(Context context,Class clz) {
        context.startActivity(new Intent(context, clz));
    }

}
