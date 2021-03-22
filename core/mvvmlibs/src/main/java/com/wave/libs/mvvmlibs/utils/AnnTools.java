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

import androidx.fragment.app.Fragment;

import com.wave.libs.mvvmlibs.annotations.UI;

import java.lang.annotation.Annotation;

/**
 * Copyright (C), 2015-2021, 深圳云集智能信息有限公司
 *
 * @fileName: AnnTools
 * @auther: Wave
 * @data: 2021/2/3 4:53 PM
 * @description:
 * @history: <author> <time> <version> <desc>
 */
public class AnnTools {

    public static UI getUI(Fragment fragment){
        if(fragment == null)return null;
        Annotation[] mAnnotations = fragment.getClass().getAnnotations();
        if(mAnnotations == null || mAnnotations.length <= 0){
            return null;
        }
        UI ui = null;
        for (Annotation annotation : mAnnotations){
            if(annotation instanceof UI){
                ui = (UI)annotation;
            }
        }
        return ui;
    }
}
