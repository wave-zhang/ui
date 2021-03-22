package com.wave.libs.mvvmlibs;/*
 * Copyright (c) 2021, zhanglang0739@gmail.com All Rights Reserved.
 * #                                                   #
 * #                       _oo0oo_                     #
 * #                      o8888888o                    #
 * #                      88" . "88                    #
 * #                      (| -_- |)                    #
 * #                      0\  =  /0                    #
 * #                    ___/`---'\___                  #
 * #                  .' \\|     |# '.                 #
 * #                 / \\|||  :  |||# \                #
 * #                / _||||| -:- |||||- \              #
 * #               |   | \\\  -  #/ |   |              #
 * #               | \_|  ''\---/''  |_/ |             #
 * #               \  .-\__  '-'  ___/-. /             #
 * #             ___'. .'  /--.--\  `. .'___           #
 * #          ."" '<  `.___\_<|>_/___.' >' "".         #
 * #         | | :  `- \`.;`\ _ /`;.`/ - ` : | |       #
 * #         \  \ `_.   \_ __\ /__ _/   .-` /  /       #
 * #     =====`-.____`.___ \_____/___.-`___.-'=====    #
 * #                       `=---='                     #
 * #     ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~   #
 * #                                                   #
 * #               佛祖保佑         永无BUG             #
 * #                                                   #
 */

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.DialogFragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.wave.libs.mvvmlibs.utils.ZLog;

/**
 * Copyright (C), 2015-2021, 深圳云集智能信息有限公司
 *
 * @fileName: MVVMDialogFragment
 * @auther: Wave
 * @data: 2021/2/3 5:38 PM
 * @description:
 * @history: <author> <time> <version> <desc>
 */
public abstract class MVVMDialogFragment<V extends MVVMViewModel,B extends ViewDataBinding> extends DialogFragment {

    private UI<V, B> ui;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ui = onCreateUI();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if(ui == null){
            ui = onCreateUI();
        }
        if(ui.isCacheView()){
            if(ui.binding == null){
                onCreateView(inflater,container);
            }
            return ui.binding.getRoot();
        }
        onCreateView(inflater,container);
        return ui.binding.getRoot();
    }

    private void onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container){
        ui.create(this,inflater,container);
        onCreateViewAfter();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onStart() {
        super.onStart();
        // 清除背景
        getDialog().getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
    }

    public UI<V,B> getUI(){return ui;}

    public abstract UI<V,B> onCreateUI();

    public abstract void onCreateViewAfter();

    public void showToast(String msg){
        Toast.makeText(getContext(),msg,Toast.LENGTH_LONG).show();
    }

    public void showToast(@StringRes int resId){
        Toast.makeText(getContext(),resId,Toast.LENGTH_LONG).show();
    }

    public NavController nav(){
        return Navigation.findNavController(this.getView());
    }

    public void navigate(@IdRes int resId){
        if(getView() == null){
            return;
        }
        nav().navigate(resId);
    }
}
