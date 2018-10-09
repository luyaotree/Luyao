package com.luyao.base;

import android.view.View;


import com.douyu.app.user.lib_asynclayoutinflater.AsyncLayoutActivity;
import com.edreamoon.router.FRouter;
import com.luyao.constraintLayout.ConstraintLayoutActivity;
import com.luyao.view.ViewActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * 后续自己的测试类仿照"data.add()"添加，MenuModel的第一个参数为列表项显示文本,第二个参数为点击事件,
 * 跳转可调用launch方法，第一个参数为跳转的Activity类，第二个参数选填为标题(跳转的类需要继承BaseAcitivty才显示标题)
 * ps:后面需要显示列表做简单测试的可以继承RvActivity实现
 */
public class MainActivity extends RvActivity {

    @Override
    protected List<MenuModel> getList() {
        ArrayList<MenuModel> data = new ArrayList<>();
        data.add(new MenuModel("AspectJ", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                launch(AspectJActivity.class, "AspectJ");
            }
        }));
        data.add(new MenuModel("AspectJ2", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                launch(com.example.aspectj.AspaectJActivity.class, "AspectJ2");
            }
        }));
        data.add(new MenuModel("权限", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                launch(PermissionA.class, "AspectJ");
            }
        }));
        data.add(new MenuModel("自定义view", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launch(ViewActivity.class, "AspectJ");
            }
        }));
        data.add(new MenuModel("ConstraintLayout使用", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launch(ConstraintLayoutActivity.class, "ConstraintLayout");
            }
        }));
        data.add(new MenuModel("H5多进程", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launch(com.luyao.webview.main.MainActivity.class, "H5多进程");
            }
        }));
        data.add(new MenuModel("Fouter", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FRouter.instance().start("/RunAloneActivity");
//                launch(com.luyao.webview.main.MainActivity.class, "H5多进程");
            }
        }));
        data.add(new MenuModel("AsyncLayoutActivity", new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                launch(AsyncLayoutActivity.class, "ConstraintLayout");
            }
        }));
        return data;
    }
}
