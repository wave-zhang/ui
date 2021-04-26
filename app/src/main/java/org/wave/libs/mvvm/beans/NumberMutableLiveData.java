package org.wave.libs.mvvm.beans;/*
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

/**
 * Copyright (C), 2015-2021, 深圳云集智能信息有限公司
 *
 * @fileName: LiveData 全局数据共享
 * @auther: Wave
 * @data: 2021/4/26 6:21 PM
 * @description:
 * @history: <author> <time> <version> <desc>
 */
public class NumberMutableLiveData {
    /**
     * 将这个Number进行全局共享
     */
    public MutableLiveData<Integer> numberLiveData = new MutableLiveData<>();

    NumberMutableLiveData(){};

    static NumberMutableLiveData numberMutableLiveData;

    /**
     * 简单一个单例
     * @return
     */
    public static NumberMutableLiveData getInstance(){
        return numberMutableLiveData == null ? numberMutableLiveData = new NumberMutableLiveData() : numberMutableLiveData;
    }
}
