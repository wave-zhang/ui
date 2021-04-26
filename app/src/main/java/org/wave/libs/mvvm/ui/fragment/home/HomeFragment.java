package org.wave.libs.mvvm.ui.fragment.home;/*
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
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.wave.libs.mvvmlibs.UIFragment;
import com.wave.libs.mvvmlibs.annotations.UI;
import com.wave.libs.mvvmlibs.utils.ZLog;

import org.wave.libs.mvvm.beans.AccountLiveData;
import org.wave.libs.mvvm.beans.User;
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
public class HomeFragment extends UIFragment<HomeViewModel, FragmentHomeBinding> implements OnHomeListener{

    @Override
    public void onCreateViewAfter() {
        // 绑定UI界面的点击事件
        getUI().getViewModel().setListener(this);
        // 监听当前UI中numberLiveData值变化
        getUI().getViewModel().numberLiveData.observe(this,this::onNumberValueChanged);
    }

    /**
     * 当number产生变化立即赋值给全局numberLiveData变量
     * @param number
     */
    void onNumberValueChanged(Integer number){
        ZLog.d("onNumberValueChanged = "+number);
        // 赋值给全局numberLiveData变量
        AccountLiveData.getInstance().numberLiveData.setValue(number);
    }

    @Override
    public void onAddNumberClick() {
        getUI().getViewModel().addNumber();
    }

    @Override
    public void onNextPageClick() {
        if(this.getView() == null)return;
        nav().navigate(R.id.action_homeFragment_to_twoFragment);
    }

    @Override
    public void onNextPage2Click() {
        if(this.getView() == null)return;
        User user = new User("小明同学","18","7527");
        HomeFragmentDirections.ActionHomeFragmentToTwoFragment actionHomeFragmentToTwoFragment = HomeFragmentDirections.actionHomeFragmentToTwoFragment();
        actionHomeFragmentToTwoFragment.setUser(user);
        nav().navigate(actionHomeFragmentToTwoFragment);
    }

    NavController nav(){
        //NavHostFragment.findNavController(this);
        return Navigation.findNavController(this.getView());
    }
}
