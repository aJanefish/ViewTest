package com.example.viewtest.activity;


import android.app.Activity;
import android.os.Bundle;
import android.view.WindowManager;

import com.example.viewtest.R;

/**
 * 测试坐标系
 */
public class FrameOfReferenceActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_frame_of_reference);
    }
}