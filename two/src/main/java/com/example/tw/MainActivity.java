package com.example.tw;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void getDefaultUncaughtExceptionHandler(View view) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = Thread.currentThread().getUncaughtExceptionHandler();
        Thread.currentThread().setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(@NonNull Thread t, @NonNull Throwable e) {

            }
        });
        Log.d("zhangyu20201220", "Android getDefaultUncaughtExceptionHandler:" + uncaughtExceptionHandler);
        //Android getDefaultUncaughtExceptionHandler:com.android.internal.os.RuntimeInit$KillApplicationHandler@45c7407
    }
}