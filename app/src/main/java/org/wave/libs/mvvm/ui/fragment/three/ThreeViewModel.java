package org.wave.libs.mvvm.ui.fragment.three;/*
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

import org.wave.libs.mvvm.ui.adapter.ThreeUserAdapter;

/**
 * Copyright (C), 2015-2021, 深圳云集智能信息有限公司
 *
 * @fileName: ThreeViewModel
 * @auther: Wave
 * @data: 2021/4/25 8:17 PM
 * @description:
 * @history: <author> <time> <version> <desc>
 */
public class ThreeViewModel extends MVVMViewModel<OnThreeListener> {

    public MutableLiveData<ThreeUserAdapter> userAdapterLiveData = new MutableLiveData<>();

    public void setAdapter(ThreeUserAdapter adapter){
        userAdapterLiveData.setValue(adapter);
    }

    public ThreeUserAdapter getAdapter(){
        return userAdapterLiveData.getValue();
    }
}
