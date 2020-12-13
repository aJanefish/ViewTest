package com.example.viewtest.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.viewtest.R;
import com.example.viewtest.view.DiyView;

public class ViewActivity extends AppCompatActivity {

    private DiyView diyView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);
        diyView = findViewById(R.id.activity_view_title);
    }


    public void tesInvalidate(View view) {
        Log.d("zhangyu1213", "tesInvalidate");
        diyView.invalidate();
    }

    public void tesRequestLayout(View view) {
        Log.d("zhangyu1213", "tesRequestLayout");
        diyView.requestLayout();
    }
}