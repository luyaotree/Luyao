package com.luyao.webview.main;


import android.content.Context;
import android.util.Log;

import com.luyao.webview.IWebBinder;
import com.luyao.webview.IWebBinderCallback;

/**
 * 用于Web端向主进程通信
 */
public class WebBinder extends IWebBinder.Stub {
    private Context context;

    public WebBinder(Context context) {
        this.context = context;
    }

    @Override
    public void handleJsFunction(String methodName, String params, IWebBinderCallback callback) {
        int pid = android.os.Process.myPid();
        Log.i("Hybrid", String.format("=======WebBinder.handleJsFunction（pid: (%s) methodName:（%s） params:（%s）", pid, methodName, params));

        JsBridge.getInstance().callJava(methodName, params, callback);
    }
}
