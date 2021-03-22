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

import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.Logger;

/**
 * Copyright (C), 2015-2021, 深圳云集智能信息有限公司
 *
 * @fileName: ZLog
 * @auther: Wave
 * @data: 2021/2/3 9:51 AM
 * @description:
 * @history: <author> <time> <version> <desc>
 */
public class ZLog {

    static boolean enable = true;

    /**
     * http://www.mamicode.com/info-detail-2536259.html
     */
    public static void create(boolean enable) {
        ZLog.enable = enable;
        Logger.clearLogAdapters();
        Logger.addLogAdapter(new AndroidLogAdapter());
    }

    public static void d(String message) {
        if(!enable || message == null) return;
        Logger.d(message);
    }

    public static void e(String message) {
        if(!enable || message == null) return;
        Logger.e(message);
    }

    public static void i(String message) {
        if(!enable || message == null) return;
        Logger.i(message);
    }

    public static void t(String message) {
        if(!enable || message == null) return;
        Logger.t(message);
    }

    public static void w(String message) {
        if(!enable || message == null) return;
        Logger.w(message);
    }

    @Deprecated
    public static void json(String json) {
        if(enable || json == null) return;
        Logger.json(json);
    }

    @Deprecated
    public static void xml(String xml) {
        if(enable || xml == null) return;
        Logger.xml(xml);
    }
}
