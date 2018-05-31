package com.example.aspectj;

import android.app.Activity;
import android.os.Bundle;

/**
 * 描述：
 *
 * @author luyao
 * @date 2018/3/13
 */
public class AspaectJActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ac_aspectj);
        Animal animal = new Animal();
        animal.fly();
    }

}
