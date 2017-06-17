package com.jc.databinding.util;

import android.databinding.BindingAdapter;
import android.databinding.BindingConversion;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bumptech.glide.Glide;

/**
 * Created by jktaihe on 17/6/17.
 * blog: blog.jktaihe.com
 */

public class BindMethodUtils {

    @BindingAdapter(value = {"url","error"},requireAll = false)
    public static void loadUrl(ImageView iv, String url, int error){
        Glide.with(iv.getContext()).load(url).into(iv).onLoadFailed(iv.getContext().getDrawable(error));
    }


    @BindingConversion
    public static Drawable colorl2Drawable(String color){
        return new ColorDrawable(Color.parseColor(color));
    }


//    开发者一般不需要重命名 setter， android 框架已经重命名了对应的实现。
//    @BindingMethods({
//            @BindingMethod(type = ImageView.class,
//                    attribute = "android:tint",
//                    method = "setImageTintList"),
//    })

}
