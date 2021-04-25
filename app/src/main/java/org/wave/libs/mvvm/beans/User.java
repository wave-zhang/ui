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

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Copyright (C), 2015-2021, 深圳云集智能信息有限公司
 *
 * @fileName: User
 * @auther: Wave
 * @data: 2021/4/25 6:31 PM
 * @description:
 * @history: <author> <time> <version> <desc>
 */
public class User implements Parcelable {

    public String name;

    public String age;

    public String token;

    public User(String name, String age, String token) {
        this.name = name;
        this.age = age;
        this.token = token;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.age);
        dest.writeString(this.token);
    }

    public void readFromParcel(Parcel source) {
        this.name = source.readString();
        this.age = source.readString();
        this.token = source.readString();
    }

    public User() {
    }

    protected User(Parcel in) {
        this.name = in.readString();
        this.age = in.readString();
        this.token = in.readString();
    }

    public static final Parcelable.Creator<User> CREATOR = new Parcelable.Creator<User>() {
        @Override
        public User createFromParcel(Parcel source) {
            return new User(source);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", token='" + token + '\'' +
                '}';
    }
}
