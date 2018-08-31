package com.luyao.aop.aspectj;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;

import com.example.aspectj.R;


@BehavioClass
public class AspectJActivity extends Activity {
    private static final String TAG = "luyao";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aspect_j);
        testAOP();
    }

    @BehaviorTrace(value = "摇一摇", type = 1)
    public void shake(View view) {
        Log.i(TAG, "进入摇一摇方法体");
        SystemClock.sleep(3000);
    }

    @BehaviorTrace(value = "朋友圈", type = 2)
    public void friend(View view) {
        Log.i(TAG, "进入朋友圈方法体");
        SystemClock.sleep(2000);
    }

    public void testAOP(){
        Log.e("luy", "testAOP");
    }

    public void testAOP1() {
        testAOP();
    }

    public void testAOP2() {
        testAOP();
    }

    public int getHeight() {
        return 1280;
    }

    public void divideZero() {
        int i = 2 / 0;
    }

    public void set() {
        Log.e("luy", "set()");
    }

    //    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_aspect_j);
//        testAOP1();
//        testAOP2();
////        DYStrUtils.isEmpty("aa");
//        DYFileUtils.hasSDCard();
////        DYFileUtils.createDirUnderDCIM();
//        getHeight();
//    }

//    // 摇一摇点击事件处理
//    public void shake(View view) {
//        long begin = SystemClock.currentThreadTimeMillis();
//
//        Log.i(TAG, "进入摇一摇方法体");
//        SystemClock.sleep(3000);
//
//        long end = SystemClock.currentThreadTimeMillis();
//        Log.i(TAG, "耗时:" + (end - begin));
//    }
//
//    // 朋友圈点击事件处理
//    public void friend(View view) {
//        long begin = SystemClock.currentThreadTimeMillis();
//
//        Log.i(TAG, "进入朋友圈方法体");
//        SystemClock.sleep(2000);
//
//        long end = SystemClock.currentThreadTimeMillis();
//        Log.i(TAG, "耗时:" + (end - begin));
//    }

}
