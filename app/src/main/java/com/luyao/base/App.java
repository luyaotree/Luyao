package com.luyao.base;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;

import com.douyu.app.user.multidex.Bean;
import com.douyu.app.user.multidex.ProductMethod;
import com.luyao.webview.main.JsBridge;
import com.luyao.webview.main.JsNativeInterface;
import com.luyao.webview.web.WorkManager;


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
        WorkManager.getInstance().postTask(new Runnable() {
            @Override
            public void run() {
                JsBridge.getInstance().register(JsNativeInterface.class);
            }
        });
    }

    public static App get() {
        return app;
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
    }
}
