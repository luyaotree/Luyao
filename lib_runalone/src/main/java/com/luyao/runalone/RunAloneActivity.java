package com.luyao.runalone;

import android.app.Activity;
import android.os.Bundle;

import com.edreamoon.router.annotation.Router;

@Router(path = "/RunAloneActivity")
public class RunAloneActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_run_alone);
    }
}
