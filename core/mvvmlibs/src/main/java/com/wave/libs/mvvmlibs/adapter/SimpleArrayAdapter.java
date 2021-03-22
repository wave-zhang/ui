package com.wave.libs.mvvmlibs.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

/**
 * 简单列表适配器
 *
 * @param <A> 数据模型
 * @param <V> 每行/列UI视图
 */
public abstract class SimpleArrayAdapter<A, V extends ViewDataBinding> extends RecyclerView.Adapter<SimpleArrayAdapter.ViewDataBindingViewHolder<V>> {

    public static class ViewDataBindingViewHolder<V extends ViewDataBinding> extends RecyclerView.ViewHolder {

        V binding;

        public ViewDataBindingViewHolder(@NonNull V binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public V getBinding() {
            return binding;
        }
    }

    protected ArrayList<A> values = new ArrayList<>();

    public abstract int layoutId();

    @NonNull
    @Override
    public ViewDataBindingViewHolder<V> onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewDataBindingViewHolder<V>(DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), layoutId(), parent, false));
    }

    @Override
    public int getItemCount() {
        return values.size();
    }

    public List<A> getValues() {
        return values;
    }

}
