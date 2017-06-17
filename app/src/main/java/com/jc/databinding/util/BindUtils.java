package com.jc.databinding.util;

import android.databinding.BindingAdapter;
import android.databinding.BindingConversion;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v4.media.VolumeProviderCompat;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.jc.databinding.module.listview.bean.ItemBean;

/**
 * Created by jktaihe on 15/6/17.
 * blog: blog.jktaihe.com
 */

public class BindUtils {

    public static void onClick(View view){
        Toast.makeText(view.getContext(),"this is onclick",Toast.LENGTH_SHORT).show();
    }

    public static void onTextChange(View view){
        Toast.makeText(view.getContext(),"this is onclick",Toast.LENGTH_SHORT).show();
    }

}
