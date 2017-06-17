package com.jc.databinding.module.bindingview;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.View;
import com.jc.databinding.R;
import com.jc.databinding.databinding.ObservableDbLayoutBinding;
import com.jc.databinding.module.bindingview.bean.ObservableUserBean;
import com.jc.databinding.module.bindingview.bean.WrapUserBean;

/**
 * Created by jc on 2016-5-12.
 */
public class ObservableDBActivity extends Activity {

    private ObservableUserBean user;
    private WrapUserBean wrapUserBean;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ObservableDbLayoutBinding eventLayoutBinding = DataBindingUtil.setContentView(this, R.layout.observable_db_layout);

        user = new ObservableUserBean("test", 20);
        eventLayoutBinding.setObservableUserBean(user);

        wrapUserBean = new WrapUserBean("wraptest", 20);
        eventLayoutBinding.setWrapUserBean(wrapUserBean);
    }

    public static void startActivity(Context context) {
        context.startActivity(new Intent(context, ObservableDBActivity.class));
    }

    public void modify_data(View view) {
        user.name = "test" + user.age;
        user.age++;
        user.setName(user.getName());
        user.setAge(user.getAge());

        wrapUserBean.name.set(user.name);
        wrapUserBean.age.set(user.age);
    }
}
