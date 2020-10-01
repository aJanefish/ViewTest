package com.example.viewtest.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

import com.example.viewtest.R;

import java.util.Arrays;

public class WindowActivity extends AppCompatActivity {

    private Window window;
    private View m;
    private int lastX;
    private int lastY;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_window);
        window = getWindow();
    }

    public void addWindowTest(View view) {
        if (m != null) {
            return;
        }

        m = new View(this);
        m.setBackgroundColor(Color.BLUE);
        m.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int x = (int) event.getX();
                int y = (int) event.getY();
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        // 记录触摸点坐标
                        lastX = x;
                        lastY = y;
                        break;
                    case MotionEvent.ACTION_MOVE:
                        // 计算偏移量
                        int offsetX = x - lastX;
                        int offsetY = y - lastY;
                        ViewGroup.MarginLayoutParams layoutParams = (ViewGroup.MarginLayoutParams) v.getLayoutParams();
//                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getLayoutParams();
                        layoutParams.leftMargin = v.getLeft() + offsetX;
                        layoutParams.topMargin = v.getTop() + offsetY;
                        v.setLayoutParams(layoutParams);
                        break;
                }
                return true;
            }
        });
        ViewGroup.LayoutParams params = new ViewGroup.LayoutParams(300, 300);
        getWindow().addContentView(m, params);

    }

    public void showWindow(View view) {
        if (m == null) {
            return;
        }
        testGetLocationxxx();
    }

    private void testGetLocationxxx() {
        int[] screen = new int[2];
        int[] widow = new int[2];
        int[] surface = new int[2];
        Log.d("zhangyu", "\n------------------------------------");
        Log.d("zhangyu", "DisplayMetrics:" + getResources().getDisplayMetrics());
        Log.d("zhangyu", "screen1:" + Arrays.toString(screen));
        Log.d("zhangyu", "widow1:" + Arrays.toString(widow));
        Log.d("zhangyu", "surface1:" + Arrays.toString(surface));
        m.getLocationOnScreen(screen);
        m.getLocationInWindow(widow);
        m.getLocationInSurface(surface);
        Log.d("zhangyu", "screen2:" + Arrays.toString(screen));
        Log.d("zhangyu", "widow2:" + Arrays.toString(widow));
        Log.d("zhangyu", "surface2:" + Arrays.toString(surface));
        //Log.d("zhangyu", "getLeft:" + viewTest.getLeft()+" getTop:"+viewTest.getTop()+" getRight:"+viewTest.getRight()+" getBottom:"+viewTest.getBottom());
        Log.d("zhangyu", "------------------------------------\n");
    }

}