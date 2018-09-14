// IWebBinder.aidl
package com.luyao.webview;
import  com.luyao.webview.IWebBinderCallback;

// Declare any non-default types here with import statements

interface IWebBinder {
void handleJsFunction(in String methodName, in String params, in IWebBinderCallback callback);
}
