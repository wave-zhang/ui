package org.wave.libs.mvvm.ui.adapter;/*
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

import androidx.annotation.NonNull;

import com.wave.libs.mvvmlibs.adapter.SimpleArrayAdapter;

import org.wave.libs.mvvm.beans.User;
import org.wave.libs.mvvm.ui.R;
import org.wave.libs.mvvm.ui.databinding.ItemTrheeUserBinding;

/**
 * Copyright (C), 2015-2021, 深圳云集智能信息有限公司
 *
 * @fileName: ThreeUserAdapter
 * @auther: Wave
 * @data: 2021/4/25 8:25 PM
 * @description:
 * @history: <author> <time> <version> <desc>
 */
public class ThreeUserAdapter extends SimpleArrayAdapter<User, ItemTrheeUserBinding> {

    @Override
    public int layoutId() {
        return R.layout.item_trhee_user;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewDataBindingViewHolder<ItemTrheeUserBinding> holder, int position) {
        holder.getBinding().setUser(getValues().get(position));
    }

    public void setListener(){

    }

    public void add(){
        User user = new User("第"+this.values.size()+"人","","");
        this.values.add(user);
        notifyItemInserted(this.values.size());
    }

}
