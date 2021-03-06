package com.luyao.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewOutlineProvider;


/**
 * 描述：
 *
 * @author luyao
 * @date 2018/7/5
 */
public class MyView extends View {
    private int RADIUS = 20;
    private int defalutSize;

    public MyView(Context context) {
        super(context);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
        //第二个参数就是我们在styles.xml文件中的<declare-styleable>标签
        //即属性集合的标签，在R文件中名称为R.styleable+name
        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.MyView);
        //第一个参数为属性集合里面的属性，R文件名称：R.styleable+属性集合名称+下划线+属性名称
        //第二个参数为，如果没有设置这个属性，则设置的默认的值
        defalutSize = a.getDimensionPixelSize(R.styleable.MyView_default_size, 100);
        //最后记得将TypedArray对象回收
        a.recycle();
        Log.e("luy", "MyView 构造函数");

        setElevation(150);
        setOutlineProvider();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    private void setOutlineProvider() {
        setOutlineProvider(new ViewOutlineProvider() {
            @Override
            public void getOutline(View view, Outline outline) {
                Path path = new Path();
                float radii[] = {10, 15, 20, 25, 30, 35, 40, 45};
                RectF tRectF = new RectF();
                tRectF.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
                path.addRoundRect(tRectF, radii, Path.Direction.CCW);
                Log.e("luy", "--->" + path.isEmpty());
                outline.setConvexPath(path);

//                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), 1);



//                Path path = new Path();
//                path.moveTo(view.getWidth(), view.getHeight());
//                path.lineTo(view.getWidth(), view.getHeight() * 2);
//                path.lineTo(view.getWidth() * 2, view.getHeight() * 2);
//                path.lineTo(view.getWidth() * 2, view.getHeight());
//                path.close();
//                outline.setConvexPath(path);
            }
        });
        setClipToOutline(true);
    }


    private int getMySize(int defaultSize, int measureSpec) {
        int mySize = defaultSize;

        int mode = MeasureSpec.getMode(measureSpec);
        int size = MeasureSpec.getSize(measureSpec);

        switch (mode) {
            case MeasureSpec.UNSPECIFIED: {//如果没有指定大小，就设置为默认大小
                mySize = defaultSize;
                break;
            }
            case MeasureSpec.AT_MOST: {//如果测量模式是最大取值为size
                //我们将大小取最大值,你也可以取其他值
                mySize = size;
                break;
            }
            case MeasureSpec.EXACTLY: {//如果是固定的大小，那就不要去改变它, 对应固定尺寸和match_parent
                mySize = size;
                break;
            }
        }
        return mySize;
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int width = getMySize(defalutSize, widthMeasureSpec);
        int height = getMySize(defalutSize, heightMeasureSpec);

        if (width < height) {
            height = width;
        } else {
            width = height;
        }

        setMeasuredDimension(width, height);
        Log.e("luy", "MyView onMeasure");

    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        Log.e("luy", "MyView onLayout");
    }

    @Override
    protected void onDraw(Canvas canvas) {
        //调用父View的onDraw函数，因为View这个类帮我们实现了一些
        // 基本的而绘制功能，比如绘制背景颜色、背景图片等
        super.onDraw(canvas);
        int r = getMeasuredWidth() / 2;//也可以是getMeasuredHeight()/2,本例中我们已经将宽高设置相等了
        //圆心的横坐标为当前的View的左边起始位置+半径
        int centerX = getLeft() + r;
        //圆心的纵坐标为当前的View的顶部起始位置+半径
        int centerY = getTop() + r;

        Paint paint = new Paint();
        paint.setColor(Color.GREEN);
        //开始绘制
//        canvas.drawCircle(centerX, centerY, r, paint);

        RectF tRectF = new RectF();
        tRectF.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
//        canvas.drawRoundRect(tRectF, RADIUS, RADIUS, paint);
        canvas.drawRoundRect(tRectF, 0,0,paint);
        Log.e("luy", "MyView onDraw");

    }


}

