package com.douyu.app.user.multidex;

import android.content.Context;
import android.widget.Toast;

/**
 * 描述：
 *
 * @author luyao
 * @date 2018/5/14
 */
public class ProductMethod {

    public static void main(String[] args) {
        productMethod();
    }

    private static void productMethod() {
        for (int i = 0; i < 10000; i++) {
            System.out.println("private void method" + i + "(){");
            if (i == 0) {
                System.out.println("    method" + 9999 + "();");
            } else {

                System.out.println("    method" + (i - 1) + "();");
            }
            System.out.println("}");
        }
    }

    public static void show(Context context,String s) {
        Toast.makeText(context, "-->" + s, Toast.LENGTH_LONG).show();
    }
}
