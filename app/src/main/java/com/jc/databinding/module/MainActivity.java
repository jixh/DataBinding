package com.jc.databinding.module;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import com.jc.databinding.R;
import com.jc.databinding.module.twowaybinding.TwoWayBindingPage;
import com.jc.databinding.module.bindingview.ObservableDBActivity;
import com.jc.databinding.module.listview.RecyclerViewPage;
import com.jc.databinding.module.sampledatabind.SampleDataBindActivity;

/**
 * Created by jktaihe on 14/6/17.
 * blog: blog.jktaihe.com
 */

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void clickdb(View view){
        SampleDataBindActivity.startActivity(this);
    }

    public void clickObservableDB(View view){
        ObservableDBActivity.startActivity(this);
    }

    public void clickRecycler(View view){
        startActivity(this,RecyclerViewPage.class);
    }

    public void twoWayBinding(View view){
        startActivity(this,TwoWayBindingPage.class);
    }

}
