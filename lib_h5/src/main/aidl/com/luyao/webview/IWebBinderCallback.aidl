// IWebBinderCallback.aidl
package com.luyao.webview;

// Declare any non-default types here with import statements

interface IWebBinderCallback {
void onResult(in int msgType, in String message);
}
