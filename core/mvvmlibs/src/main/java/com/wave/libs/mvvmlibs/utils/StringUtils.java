package com.wave.libs.mvvmlibs.utils;

public class StringUtils {

    public static boolean isEmpty(String msg){
        return msg == null || msg.trim().equals("");
    }
    public static boolean isHttpURL(String msg){
        if(isEmpty(msg)){
            return false;
        }
        return msg.startsWith("http://") || msg.startsWith("https://");
    }

    public static boolean isApkDownloadPath(String url){
        return isHttpURL(url) && url.endsWith(".apk");
    }
}
