package com.example.arouterdemo;

import android.app.Application;

import com.example.arouter.ARouter;

/**
 * @author wang wen kai
 * @date 2019-08-02 on 00:30
 * @description
 */
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        ARouter.getInstance().init(this);
    }
}
