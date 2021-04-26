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

import androidx.databinding.library.baseAdapters.BR;
import androidx.navigation.Navigation;

import com.wave.libs.mvvmlibs.UIFragment;
import com.wave.libs.mvvmlibs.annotations.UI;
import com.wave.libs.mvvmlibs.utils.ZLog;

import org.wave.libs.mvvm.beans.NumberMutableLiveData;
import org.wave.libs.mvvm.ui.R;
import org.wave.libs.mvvm.ui.databinding.FragmentTwoBinding;

/**
 * Copyright (C), 2015-2021, 深圳云集智能信息有限公司
 *
 * @fileName: TwoFragment
 * @auther: Wave
 * @data: 2021/4/25 6:24 PM
 * @description:
 * @history: <author> <time> <version> <desc>
 */
@UI(layout = R.layout.fragment_two,vmId = BR.vmTwo)
public class TwoFragment extends UIFragment<TwoViewModel, FragmentTwoBinding> implements OnTwoListener{

    @Override
    public void onCreateViewAfter() {
        getUI().getViewModel().setListener(this);
        NumberMutableLiveData.getInstance().numberLiveData.observe(this.getViewLifecycleOwner(),this::onNumberValueChanged);
        of();
    }

    void onNumberValueChanged(Integer number){
        ZLog.d("TwoFragment onNumberValueChanged = "+number);
    }

    @Override
    public void onBackClick() {
        Navigation.findNavController(getView()).navigateUp();
    }

    @Override
    public void onNextClick() {
        //NumberMutableLiveData.getInstance().numberLiveData.setValue(9000);
        Navigation.findNavController(getView()).navigate(R.id.action_twoFragment_to_threeFragment);
    }

    void of(){
        if(this.getArguments() == null)return;
        getUI().getViewModel().setUser(TwoFragmentArgs.fromBundle(this.getArguments()).getUser());
    }
}
