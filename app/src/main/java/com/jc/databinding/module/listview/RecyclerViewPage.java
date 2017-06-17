package com.jc.databinding.module.listview;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.jc.databinding.R;
import com.jc.databinding.module.listview.bean.ItemBean;
import com.jc.databinding.module.listview.bean.ItemHeaderBean;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jktaihe on 14/6/17.
 * blog: blog.jktaihe.com
 */

public class RecyclerViewPage extends Activity {

    RecyclerView recyclerView;
    RecyclerAdapter mAdapter;
    public static final String avter = "http://img.tupianzj.com/uploads/allimg/160403/9-160403122105.jpg";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_recyclerview);
        recyclerView = (RecyclerView) findViewById(R.id.rv);
        mAdapter = new RecyclerViewAdapter();
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(mAdapter);
        addData();
    }

    private void addData() {
        List<Object> list  = new ArrayList<>();
        list.add(new ItemHeaderBean("this is header",20));
        list.add(new ItemBean("sala",21,avter));
        list.add(new ItemBean("toom",20,avter));
        list.add(new ItemBean("to2",20,avter));
        list.add(new ItemBean("sls",20,avter));
        list.add(new ItemBean("dfjk",20,avter));
        list.add(new ItemBean("sfs",20,avter));
        list.add(new ItemBean("sfd",20,avter));
        list.add(new ItemBean("sff",20,avter));
        list.add(new ItemBean("fsd",20,avter));
        list.add(new ItemBean("sea",20,avter));
        mAdapter.setList(list);
    }
}
