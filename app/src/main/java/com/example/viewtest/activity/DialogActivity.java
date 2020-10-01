package com.example.viewtest.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.example.viewtest.R;

import java.util.Arrays;

public class DialogActivity extends AppCompatActivity {

    private Dialog mShareDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);
    }

    public void showDialog(View view) {
        showDialog();
    }

    /**
     * 显示弹出框
     */
    private void showDialog() {
        if (mShareDialog == null) {
            initShareDialog();
        }
        mShareDialog.show();
    }

    /**
     * 初始化分享弹出框
     */
    private void initShareDialog() {
        mShareDialog = new Dialog(this);
        mShareDialog.setCanceledOnTouchOutside(true); //手指触碰到外界取消
        mShareDialog.setCancelable(true);             //可取消 为true
        Window window = mShareDialog.getWindow();      // 得到dialog的窗体
        //window.setGravity(Gravity.BOTTOM);

        View view = View.inflate(this, R.layout.lay_share, null); //获取布局视图
        view.findViewById(R.id.tv_cancel).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("zhangyu", "" + view);
                testGetLocationxxx(view);
//                if (mShareDialog != null && mShareDialog.isShowing()) {
//                    mShareDialog.dismiss();
//                }
            }
        });
        window.setContentView(view);
        window.setLayout(900,900);//设置横向全屏
    }


    private void testGetLocationxxx(View view) {
        int[] screen = new int[2];
        int[] widow = new int[2];
        int[] surface = new int[2];
        Log.d("zhangyu", "\n------------------------------------");
        Log.d("zhangyu", "DisplayMetrics:" + getResources().getDisplayMetrics());
        Log.d("zhangyu", "screen1:" + Arrays.toString(screen));
        Log.d("zhangyu", "widow1:" + Arrays.toString(widow));
        Log.d("zhangyu", "surface1:" + Arrays.toString(surface));
        view.getLocationOnScreen(screen);
        view.getLocationInWindow(widow);
        view.getLocationInSurface(surface);
        Log.d("zhangyu", "screen2:" + Arrays.toString(screen));
        Log.d("zhangyu", "widow2:" + Arrays.toString(widow));
        Log.d("zhangyu", "surface2:" + Arrays.toString(surface));
        //Log.d("zhangyu", "getLeft:" + viewTest.getLeft()+" getTop:"+viewTest.getTop()+" getRight:"+viewTest.getRight()+" getBottom:"+viewTest.getBottom());
        Log.d("zhangyu", "------------------------------------\n");
    }
}