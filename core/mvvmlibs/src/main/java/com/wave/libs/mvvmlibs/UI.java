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

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.wave.libs.mvvmlibs.utils.ZLog;

/**
 * Copyright (C), 2015-2021, 深圳云集智能信息有限公司
 *
 * @fileName: UI
 * @auther: Wave
 * @data: 2021/2/3 3:25 PM
 * @description:
 * @history: <author> <time> <version> <desc>
 */
public class UI<V extends MVVMViewModel, B extends ViewDataBinding> {

    protected V viewModel;

    protected B binding;

    Builder builder;

    UI(Builder builder) {
        this.builder = builder;
    }

    protected boolean isCacheView() {
        return builder.isCacheView;
    }

    protected void create(@NonNull Fragment fragment, @NonNull LayoutInflater inflater, @Nullable ViewGroup container) {
        //Class<V> vClass = (Class <V>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        Class<V> modelClass = builder.viewModelClass;
        viewModel = new ViewModelProvider(fragment).get(modelClass);
        binding = DataBindingUtil.inflate(inflater, builder.layoutId, container, false);
        binding.setLifecycleOwner(fragment);
        binding.setVariable(builder.variableId, viewModel);
        binding.executePendingBindings();
    }

    public void setVariable(int variableId, @Nullable Object value) {
        ZLog.e("setVariable = " + variableId);
        binding.setVariable(variableId, value);
    }

    /**
     * 获取当前视图的主viewModel
     *
     * @return
     */
    public V getViewModel() {
        return viewModel;
    }

    /**
     * 获取当前视图的binding
     *
     * @return
     */
    public B getBinding() {
        return binding;
    }

    public static class Builder<V extends MVVMViewModel, B extends ViewDataBinding> {

        private Integer layoutId, variableId;

        private boolean isCacheView;
        // 默认使用 Fragment onKeyDown onKeyUp
        public boolean isInterceptKey = true;

        private Class<V> viewModelClass;

        /**
         * 视图ID
         *
         * @param layoutId
         * @return
         */
        public Builder setLayoutId(Integer layoutId) {
            this.layoutId = layoutId;
            return this;
        }

        /**
         * 主ViewModel 类型
         *
         * @param viewModelClass
         * @return
         */
        public Builder setViewModelClass(Class<V> viewModelClass) {
            this.viewModelClass = viewModelClass;
            return this;
        }

        /**
         * 布局与viewModel 绑定 ID
         * 通情况下一个视图只需要一个viewModel 如 : variableId 与 viewModelClass 对应不上. 则绑定会无效
         * 如有复杂多绑定操作, 推荐使用 ui.setVariable(id,obj) 或 使用 ui.getBinding().setXXX(...) 函数操作
         *
         * @param variableId
         * @return
         */
        public Builder setVariableId(Integer variableId) {
            this.variableId = variableId;
            return this;
        }

        /**
         * 当前视图是否开启缓存
         * 此函数仅对Fragment有效
         * 默认情况为不开启,
         * Fragment会重走onCrateView -> onCreateViewAfter 函数
         * 开启则, onCreateViewAfter 只会执行一次
         *
         * @param cacheView
         * @return
         */
        public Builder setCacheView(boolean cacheView) {
            isCacheView = cacheView;
            return this;
        }

        /**
         * Fragment 是否拦截keyDown,keyUp
         * 拦截之后可重写fragment onKeyDown or onKeyUp 事件
         * 如遇到一个Activity同时展示多个Fragment 注意事件覆盖顺序
         * 此条件下建议不使用拦截事件
         *
         * @param interceptKey
         */
        public Builder setInterceptKey(boolean interceptKey) {
            isInterceptKey = interceptKey;
            return this;
        }

        public UI<V,B> build() {
            return new UI(this);
        }
    }
}
