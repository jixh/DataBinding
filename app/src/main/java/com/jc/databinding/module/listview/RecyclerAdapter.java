package com.jc.databinding.module.listview;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.IdRes;
import android.support.annotation.LayoutRes;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jktaihe on 14/6/17.
 * blog: blog.jktaihe.com
 */

abstract class RecyclerAdapter<T> extends RecyclerView.Adapter<RecyclerAdapter.RecyclerBindingViewHolder> {


    protected List<T> items = new ArrayList<>();

    public void setList(List<T> list){
        items.clear();
        items.addAll(list);
        notifyDataSetChanged();
    }

    @Override
    public RecyclerBindingViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        return RecyclerBindingViewHolder.createViewHolder(viewGroup,itemLayoutId(viewType));
    }


    @Override
    public void onBindViewHolder(RecyclerBindingViewHolder viewHolder, int i) {
        viewHolder.binding.setVariable(itemVariableId(), items.get(i));
        viewHolder.binding.executePendingBindings();
        Log.i("onBindViewHolder",items.get(i).toString());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }


    static class RecyclerBindingViewHolder extends RecyclerView.ViewHolder{

        ViewDataBinding binding;

        public RecyclerBindingViewHolder(ViewDataBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public static RecyclerBindingViewHolder createViewHolder(ViewGroup parent, int layoutId){
            ViewDataBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),layoutId , parent, false);
            return new RecyclerBindingViewHolder(binding);
        }
    }

    abstract @LayoutRes int itemLayoutId(int viewType);

    abstract @IdRes int itemVariableId();

}

