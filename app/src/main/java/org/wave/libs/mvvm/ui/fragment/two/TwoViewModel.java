package org.wave.libs.mvvm.ui.fragment.two;/*
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

import androidx.lifecycle.MutableLiveData;

import com.wave.libs.mvvmlibs.MVVMViewModel;

import org.wave.libs.mvvm.beans.User;

/**
 * Copyright (C), 2015-2021, 深圳云集智能信息有限公司
 *
 * @fileName: TwoViewModel
 * @auther: Wave
 * @data: 2021/4/25 6:24 PM
 * @description:
 * @history: <author> <time> <version> <desc>
 */
public class TwoViewModel extends MVVMViewModel<OnTwoListener> {

    public MutableLiveData<User> userLiveData = new MutableLiveData<>();

    public void setUser(User user){
        if(user == null)return;
        userLiveData.setValue(user);
    }
}
