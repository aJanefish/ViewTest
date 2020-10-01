package com.example.viewtest.activity;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ScrollView;

import com.example.viewtest.R;

import java.util.Arrays;

/**
 * 测试getLocalVisibleRect
 */
public class LocalVisibleRectActivity extends AppCompatActivity {
    private static final String TAG = "zy.LocalVisibleRect";

    private Button button1;
    private Button button5;
    private View viewTest;
    private ScrollView scrollView1;

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_local_visible_rect);
        button1 = findViewById(R.id.activity_local_visible_rect_button1);
        button5 = findViewById(R.id.activity_local_visible_rect_button5);
        viewTest = findViewById(R.id.activity_local_visible_rect_view);
        scrollView1 = findViewById(R.id.activity_local_visible_rect_sv);
    }

    public void show(View view) {

        //testGetGlobalVisibleRect();
        testGetLocationxxx();

    }

    private void testGetGlobalVisibleRect() {
        Rect LocalVisibleRect = new Rect();
        Rect GlobalVisibleRect = new Rect();
        Log.d("zhangyu", "\n------------------------------------");
        Log.d("zhangyu", "DisplayMetrics:" + getResources().getDisplayMetrics());
        Log.d("zhangyu", "localVisibleRect:" + viewTest.getLocalVisibleRect(LocalVisibleRect) + " LocalVisibleRect:" + LocalVisibleRect);
        Log.d("zhangyu", "globalVisibleRect:" + viewTest.getGlobalVisibleRect(GlobalVisibleRect) + " GlobalVisibleRect:" + GlobalVisibleRect);
        Log.d("zhangyu", "------------------------------------\n");
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
        viewTest.getLocationOnScreen(screen);
        viewTest.getLocationInWindow(widow);
        viewTest.getLocationInSurface(surface);
        Log.d("zhangyu", "screen2:" + Arrays.toString(screen));
        Log.d("zhangyu", "widow2:" + Arrays.toString(widow));
        Log.d("zhangyu", "surface2:" + Arrays.toString(surface));
        //Log.d("zhangyu", "getLeft:" + viewTest.getLeft()+" getTop:"+viewTest.getTop()+" getRight:"+viewTest.getRight()+" getBottom:"+viewTest.getBottom());
        Log.d("zhangyu", "------------------------------------\n");
    }


}