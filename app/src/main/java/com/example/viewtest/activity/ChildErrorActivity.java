package com.example.viewtest.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.viewtest.R;

import java.util.Random;

public class ChildErrorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child_error);
    }

    public void testChildError111(View view) {
        testChildThreadError();
    }

    //测试子线程异常，主线程崩溃
    private static void testChildThreadError() {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
//                try {
//                    testChild();
//                } catch (Exception e) {
//                    Log.e("zhangyu1219", "catch:" + e);
//                } finally {
//                    Log.e("zhangyu1219", "catch finally");
//                }
                testError();
            }
        });
        thread.start();

        Log.d("zhangyu1219", "testError ");

    }

    private static void testError() {
        int y = new Random().nextInt(2);
        Log.d("zhangyu20201220", "testError:" + y);
        int x = 10 / y;

    }

    //测试主线程崩溃
    public void testMainError111(View view) {
        testError();
    }

    public void getDefaultUncaughtExceptionHandler(View view) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
//        Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = Thread.currentThread().getUncaughtExceptionHandler();
//        Thread.currentThread().setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
//            @Override
//            public void uncaughtException(@NonNull Thread t, @NonNull Throwable e) {
//
//            }
//        });
        Log.d("zhangyu20201220", "Android getDefaultUncaughtExceptionHandler:" + uncaughtExceptionHandler);
        //Android getDefaultUncaughtExceptionHandler:com.android.internal.os.RuntimeInit$KillApplicationHandler@45c7407
    }

    public void setDefaultUncaughtExceptionHandler(View view) {
        Log.d("zhangyu20201220", "Android setDefaultUncaughtExceptionHandler");
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(@NonNull Thread t, @NonNull Throwable e) {
                Log.d("zhangyu20201220", "Android uncaughtException:" + t + " " + Thread.currentThread() + " " + e);
            }
        });
    }
}