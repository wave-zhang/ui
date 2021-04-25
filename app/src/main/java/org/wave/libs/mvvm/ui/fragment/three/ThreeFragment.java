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

import androidx.databinding.library.baseAdapters.BR;
import androidx.navigation.Navigation;

import com.wave.libs.mvvmlibs.UIFragment;
import com.wave.libs.mvvmlibs.annotations.UI;

import org.wave.libs.mvvm.ui.R;
import org.wave.libs.mvvm.ui.adapter.ThreeUserAdapter;
import org.wave.libs.mvvm.ui.databinding.FragmentThreeBinding;

/**
 * Copyright (C), 2015-2021, 深圳云集智能信息有限公司
 *
 * @fileName: ThreeFragment
 * @auther: Wave
 * @data: 2021/4/25 8:17 PM
 * @description:
 * @history: <author> <time> <version> <desc>
 */
@UI(layout = R.layout.fragment_three,vmId = BR.vmThree)
public class ThreeFragment extends UIFragment<ThreeViewModel, FragmentThreeBinding> implements OnThreeListener{

    @Override
    public void onCreateViewAfter() {
        getUI().getViewModel().setListener(this);
        onCreateViews();
    }

    @Override
    public void onBackClick() {
        Navigation.findNavController(getView()).navigateUp();
    }

    @Override
    public void onAddUserClick() {
        //getUI().getViewModel().userAdapterLiveData.getValue().add();
        getUI().getViewModel().getAdapter().add();
    }

    void onCreateViews(){
        ThreeUserAdapter adapter = new ThreeUserAdapter();
        //adapter.setListener();
        getUI().getViewModel().setAdapter(adapter);
    }
}
