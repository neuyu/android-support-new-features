package com.neu.androidsupport232features;

import android.app.Application;
import android.support.v7.app.AppCompatDelegate;

/**
 * Created by neu on 16/3/1.
 */
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        //设置该app的主题根据时间不同显示
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_AUTO);

    }
}
