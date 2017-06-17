package com.jc.databinding.module;

import android.view.View;
import android.widget.Toast;

/**
 * Created by jktaihe on 15/6/17.
 * blog: blog.jktaihe.com
 */

public class EventHandler {
    public static void onClick(View view){
        Toast.makeText(view.getContext(),"this is onclick",Toast.LENGTH_SHORT).show();
    }

}
