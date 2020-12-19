package com.example.viewtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.viewtest.activity.DialogActivity;
import com.example.viewtest.activity.FrameOfReferenceActivity;
import com.example.viewtest.activity.LocalVisibleRectActivity;
import com.example.viewtest.activity.TestMotionEventAActivity;
import com.example.viewtest.activity.TestMotionEventBActivity;
import com.example.viewtest.activity.TouchDelegateActivity;
import com.example.viewtest.activity.ViewActivity;
import com.example.viewtest.activity.WindowActivity;

/**
 * 测试Android的坐标体系
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void frameOfReference(View view) {
        startActivity(new Intent(this, FrameOfReferenceActivity.class));
    }

    public void testLocalVisibleRect(View view) {
        startActivity(new Intent(this, LocalVisibleRectActivity.class));
    }

    //测试Window
    public void testWindow(View view) {
        startActivity(new Intent(this, WindowActivity.class));
    }

    //测试Dialog
    public void testDialog(View view) {
        startActivity(new Intent(this, DialogActivity.class));
    }

    //测试View的绘制方法调用+invalidate + requestLayout
    public void testView(View view) {
        startActivity(new Intent(this, ViewActivity.class));
    }

    public void testTouchDelegate(View view) {
        startActivity(new Intent(this, TouchDelegateActivity.class));
    }

    public void testMotionEventA(View view) {
        startActivity(new Intent(this, TestMotionEventAActivity.class));
    }

    public void testMotionEventB(View view) {
        startActivity(new Intent(this, TestMotionEventBActivity.class));
    }

    public void testMotionEventC(View view) {
        startActivity(new Intent(this, TestMotionEventBActivity.class));
    }
}