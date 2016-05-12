package com.jc.databinding.ui.showdata;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;

import com.jc.databinding.R;
import com.jc.databinding.bean.UserBean;
import com.jc.databinding.databinding.DbLayoutBinding;

/**
 * Created by jc on 2016-5-12.
 */
public class DBActivity extends Activity {

    private UserBean user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DbLayoutBinding eventLayoutBinding = DataBindingUtil.setContentView(this, R.layout.db_layout);
        user = new UserBean("test", 20);
        eventLayoutBinding.setUser(user);
    }

    public static void startActivity(Context context){
        context.startActivity(new Intent(context,DBActivity.class));
    }

}
