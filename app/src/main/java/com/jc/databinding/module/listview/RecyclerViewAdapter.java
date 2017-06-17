package com.jc.databinding.module.listview;


import com.jc.databinding.BR;
import com.jc.databinding.R;
import com.jc.databinding.module.listview.bean.ItemHeaderBean;

/**
 * Created by jktaihe on 16/6/17.
 * blog: blog.jktaihe.com
 */

public class RecyclerViewAdapter extends RecyclerAdapter<Object> {


    @Override
    int itemLayoutId(int viewType) {
        return viewType;
    }

    @Override
    int itemVariableId() {
        return BR.item;
    }


    @Override
    public int getItemViewType(int position) {
        return (items.get(position) instanceof ItemHeaderBean)?R.layout.layout_item_header:R.layout.layout_item;
    }

}
