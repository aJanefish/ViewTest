package com.example.viewtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.viewtest.activity.DialogActivity;
import com.example.viewtest.activity.FrameOfReferenceActivity;
import com.example.viewtest.activity.LocalVisibleRectActivity;
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

    public void testWindow(View view) {
        startActivity(new Intent(this, WindowActivity.class));
    }

    public void testDialog(View view) {
        startActivity(new Intent(this, DialogActivity.class));

    }
}