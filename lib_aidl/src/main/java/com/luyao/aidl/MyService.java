package com.luyao.aidl;

import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.nfc.Tag;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.annotation.Nullable;

import com.ryg.sayhi.aidl.IMyService;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述：
 *
 * @author luyao
 * @date 2018/9/14
 */
public class MyService extends Service {

    private static final String TAG = "MyService";
    public static final String PACKAGE_SAYHI = "com.example.test";

    private NotificationManager mNotificationManager;
    private boolean mCanRun = false;
    private List<Student> mStudent = new ArrayList<>();

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    private final IMyService.Stub mBinder = new IMyService.Stub() {
        @Override
        public String getName() throws RemoteException {
            return null;
        }
    };
}
