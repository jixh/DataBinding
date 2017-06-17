package com.jc.databinding.module.sampledatabind;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.databinding.OnRebindCallback;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import com.jc.databinding.R;
import com.jc.databinding.databinding.DBSample;
import com.jc.databinding.module.sampledatabind.bean.SampleDataBindBean;

/**
 * Created by jc on 2016-5-12.
 */
public class SampleDataBindActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        DBSample viewBinding = DataBindingUtil.setContentView(this, R.layout.layout_sample_databind);


        viewBinding.addOnRebindCallback(new OnRebindCallback() {
            @Override
            public boolean onPreBind(ViewDataBinding binding) {
                return super.onPreBind(binding);
            }

            @Override
            public void onCanceled(ViewDataBinding binding) {
                super.onCanceled(binding);
            }

            @Override
            public void onBound(ViewDataBinding binding) {
                super.onBound(binding);
            }
        });


        SampleDataBindBean sampleDataBindBean = new SampleDataBindBean("sampleData");
        viewBinding.setItem(sampleDataBindBean);
    }

    public static void startActivity(Context context){
        context.startActivity(new Intent(context,SampleDataBindActivity.class));
    }

}
