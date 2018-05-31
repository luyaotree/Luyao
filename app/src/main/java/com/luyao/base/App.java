package com.luyao.base;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;

import com.douyu.app.user.multidex.Bean;
import com.douyu.app.user.multidex.ProductMethod;


/**
 * 描述：
 *
 * @author Jimmy
 * @date 2018/2/6 13:08
 */
public class App extends Application {
    public static App app;

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(App.this);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        app = this;
    }

    public static App get() {
        return app;
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
    }
}
