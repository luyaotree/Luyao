package com.luyao.view;

import android.app.Activity;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

import com.edreamoon.router.annotation.Router;

@Router(path = "/ViewActivity")
public class ViewActivity extends Activity {
    long start;
    long onCreate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        start = System.currentTimeMillis();
        setContentView(R.layout.activity_view);
        onCreate = System.currentTimeMillis();
        Log.e("luy", "onCreate 耗时:"+(System.currentTimeMillis() - start));
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("luy", "onResume 耗时:"+(System.currentTimeMillis() - onCreate));

    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        Log.e("luy", "onWindowFocusChanged 耗时:"+(System.currentTimeMillis() - onCreate));
    }
}
