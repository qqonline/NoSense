package com.tianpeng.dplink;

import android.app.Application;

import com.tianpeng.sdplink.entity.SDPSDK;


/**
 * Created by YuHong on 2019/5/30 0030.
 */
public class MyAPP extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        SDPSDK.getInstance().init(getApplicationContext(),"RE6OYRTCV4568");
    }

}
