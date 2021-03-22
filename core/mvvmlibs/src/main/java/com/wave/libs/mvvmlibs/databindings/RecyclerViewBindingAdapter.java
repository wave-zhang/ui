package com.wave.libs.mvvmlibs.databindings;/*
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

import androidx.databinding.BindingAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.wave.libs.mvvmlibs.adapter.SimpleArrayAdapter;

/**
 * Copyright (C), 2015-2021, 深圳云集智能信息有限公司
 *
 * @fileName: RecyclerViewBindingAdapter
 * @auther: Wave
 * @data: 2021/2/4 1:46 PM
 * @description:
 * @history: <author> <time> <version> <desc>
 */
public class RecyclerViewBindingAdapter {

    @BindingAdapter({"android:layoutManager", "android:adapter"})
    public static void setAdapter(RecyclerView view, RecyclerView.LayoutManager layout, SimpleArrayAdapter adapter) {
        if( view == null ) {
            return;
        }
        if( layout != null ) {
            view.setLayoutManager(layout);
        }
        if( adapter != null ) {
            view.setAdapter(adapter);
        }
    }

    @BindingAdapter("android:scrollToPosition")
    public static void scrollToPosition(RecyclerView view, Integer position) {
        if( view == null || position == null ) return;
        view.scrollToPosition(position);
    }
}
