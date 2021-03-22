package com.wave.libs.mvvmlibs.databindings;

import android.view.View;
import android.view.ViewGroup;

import androidx.databinding.BindingAdapter;

public class ViewDataBindingAdapter {

    @BindingAdapter("android:topBarHeight")
    public static void setTopBarHeight(View view,Integer height){
        if(view == null || height == null)return;
        ViewGroup.LayoutParams params = view.getLayoutParams();
        params.height = height;
        view.setLayoutParams(params);
    }
}
