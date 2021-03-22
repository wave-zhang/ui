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

import androidx.databinding.ViewDataBinding;

import com.wave.libs.mvvmlibs.utils.AnnTools;

import java.lang.reflect.ParameterizedType;

/**
 * Copyright (C), 2015-2021, 深圳云集智能信息有限公司
 *
 * @fileName: UIDialogFragment
 * @auther: Wave
 * @data: 2021/2/3 5:40 PM
 * @description:
 * @history: <author> <time> <version> <desc>
 */
public abstract class UIDialogFragment<V extends MVVMViewModel,B extends ViewDataBinding> extends MVVMDialogFragment<V,B>{

    @Override
    public UI<V, B> onCreateUI() {
        return newUI();
    }

    Class<V> findViewModelClass(){
        return (Class <V>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

    UI newUI(){
        Class<V> viewModelClass = findViewModelClass();
        com.wave.libs.mvvmlibs.annotations.UI ui = AnnTools.getUI(this);
        int layoutId = ui.layout();
        int vmId = ui.vmId();
        boolean viewCache = ui.viewCache();
        return new UI.Builder<V, B>()
                .setViewModelClass(viewModelClass)
                .setLayoutId(layoutId)
                .setVariableId(vmId)
                .setCacheView(viewCache) // 是否需要开启视图缓存
                .build();
    }


}
