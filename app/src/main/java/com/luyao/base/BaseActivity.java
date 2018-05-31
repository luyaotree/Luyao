package com.luyao.base;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

/**
 * 描述：
 *
 * @author luyao
 * @date 2017/12/29 13:12
 */
public abstract class BaseActivity extends Activity {
    public static final String TITLE_KEY = "title_key";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String title = getIntent().getStringExtra(TITLE_KEY);
        if (title != null) {
            setTitle(title);
        }
    }

    protected void showDialog(String content) {
        new AlertDialog.Builder(this)
                .setMessage(content)
                .show();
    }

    /**
     * 设置启动的类和标题
     */
    protected void launch(Class targetActivity, String title) {
        Intent intent = new Intent(this, targetActivity);
        intent.putExtra(TITLE_KEY, title);
        startActivity(intent);
    }

    protected void launch(Class targetActivity) {
        launch(targetActivity, "");
    }

}
