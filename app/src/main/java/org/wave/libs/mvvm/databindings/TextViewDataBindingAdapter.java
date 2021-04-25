package org.wave.libs.mvvm.databindings;/*
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

import android.annotation.SuppressLint;
import android.widget.TextView;

import androidx.databinding.BindingAdapter;

import org.wave.libs.mvvm.beans.User;
import org.wave.libs.mvvm.ui.R;

/**
 * Copyright (C), 2015-2021, 深圳云集智能信息有限公司
 *
 * @fileName: TextViewDataBindingAdapter
 * @auther: Wave
 * @data: 2021/4/25 7:28 PM
 * @description:
 * @history: <author> <time> <version> <desc>
 */
public class TextViewDataBindingAdapter {

    @BindingAdapter("android:userValue")
    public static void setUserValue(TextView view, User user){
        if(view == null)return;
        String value = user == null ? view.getResources().getString(R.string.two_page_no_param) : view.getResources().getString(R.string.two_page_param,user.toString());
        view.setText(value);
    }
}
