package org.wave.libs.mvvm.ui.fragment;/*
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

import androidx.databinding.library.baseAdapters.BR;

import com.wave.libs.mvvmlibs.UIFragment;
import com.wave.libs.mvvmlibs.annotations.UI;

import org.wave.libs.mvvm.ui.R;
import org.wave.libs.mvvm.ui.databinding.FragmentHomeBinding;

/**
 * Copyright (C), 2015-2021, 深圳云集智能信息有限公司
 *
 * @fileName: HomeFragment
 * @auther: Wave
 * @data: 2021/3/22 2:17 PM
 * @description:
 * @history: <author> <time> <version> <desc>
 */
@UI(layout = R.layout.fragment_home,vmId = BR.vmHome)
public class HomeFragment extends UIFragment<HomeViewModel, FragmentHomeBinding> {

    @Override
    public void onCreateViewAfter() {

    }
}
