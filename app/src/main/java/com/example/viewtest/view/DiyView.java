package com.example.viewtest.view;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import androidx.annotation.Nullable;

public class DiyView extends View {
    public DiyView(Context context) {
        super(context);
    }

    public DiyView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public DiyView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public DiyView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }


    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {

        Log.d("zhangyu", MotionEvent.actionToString(event.getAction()) + "-------------------------------------------");
        Log.d("zhangyu", "width:" + getWidth() + " height:" + getHeight() + " " + getResources().getDisplayMetrics());
        Log.d("zhangyu", "getRawX:" + event.getRawX() + " getRawY:" + event.getRawY());
        Log.d("zhangyu", "getX:" + event.getX() + " getY:" + event.getY());
        Log.d("zhangyu", "getLeft:" + getLeft() + " getTop:" + getTop() + " getRight:" + getRight() + " getBottom:" + getBottom());
        Log.d("zhangyu", MotionEvent.actionToString(event.getAction()) + "-------------------------------------------\n");

        return super.dispatchTouchEvent(event);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        Log.d("zhangyu1213", "DiyView onMeasure");
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        Log.d("zhangyu1213", "DiyView onLayout");
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Log.d("zhangyu1213", "DiyView onDraw "+Log.getStackTraceString(new Throwable()));
    }
}
