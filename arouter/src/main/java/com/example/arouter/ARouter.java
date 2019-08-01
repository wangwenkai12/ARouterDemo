package com.example.arouter;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wang wen kai
 * @date 2019-08-02 on 00:14
 * @description
 */
public class ARouter {

    private Map<String, Class<? extends Activity>> mActivityMap;
    private Context mContext;
    private static ARouter mARouter = new ARouter();

    private ARouter() {
        mActivityMap = new HashMap<>();
    }

    public static ARouter getInstance() {
        return mARouter;
    }

    public void init(Application application) {
        this.mContext = application;
    }

    /**
     * 存储Activity
     *
     * @param path  Activity路径
     * @param clazz Activity
     */
    public void putActivity(String path, Class<? extends Activity> clazz) {
        mActivityMap.put(path, clazz);
    }

    /**
     * 跳转到Activity
     *
     * @param path
     * @param bundle
     */
    public void startToActivity(String path, Bundle bundle) {
        Class<? extends Activity> clazz = mActivityMap.get(path);
        Intent intent = new Intent();
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        if (clazz == null) {
            return;
        }
        intent.setClass(mContext, clazz);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        mContext.startActivity(intent);
    }
}
