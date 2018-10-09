package com.douyu.app.user.lib_asynclayoutinflater;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class AsyncLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        new Thread(new Runnable() {
            @Override
            public void run() {
                setContentView(R.layout.activity_async_layout);
            }
        }).start();
    }
}
