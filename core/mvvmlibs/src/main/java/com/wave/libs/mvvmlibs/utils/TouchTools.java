package com.wave.libs.mvvmlibs.utils;/*
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

/**
 * Copyright (C), 2015-2021, 深圳云集智能信息有限公司
 *
 * @fileName: TouchTools
 * @auther: Wave
 * @data: 2021/2/3 5:46 PM
 * @description:
 * @history: <author> <time> <version> <desc>
 */
public class TouchTools {

    static long mValidTime = 500L;

    static long upClickTime = 0;

    /**
     * 调整合法点击事件的有效伐值
     * @param mValidTime1 有效伐值
     */
    public static void create(long mValidTime1){
        mValidTime = mValidTime1;
    }

    /**
     * 防抖动点击事件. 两点之间的间隔必须大于 mValidTime 值
     * @return true 表示有效点击事件, false 则表示无效点击事件
     */
    public static boolean isValid(){
        long mClickTime = System.currentTimeMillis();
        boolean isValid = mClickTime - upClickTime > mValidTime;
        upClickTime = mClickTime;
        return isValid;
    }
}
