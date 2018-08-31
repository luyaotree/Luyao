package com.shapeimg;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.douyu.app.user.plugin.R;

public class TestShapeAc extends Activity {
    ShapeImageView shapeImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_shape);

        shapeImageView = (ShapeImageView) findViewById(R.id.img1);
        shapeImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shapeImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            }
        });
    }
}
