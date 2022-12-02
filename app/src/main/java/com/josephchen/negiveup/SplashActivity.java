package com.josephchen.negiveup;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;

import com.josephchen.negiveup.common.BaseCompatActivity;

@SuppressLint("CustomSplashScreen")
public class SplashActivity extends BaseCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                go(MainActivity.class);
            }
        }, 800);

        // TODO: 2022/12/2 在android12中，不能自定义自己的启动界面了，这里需要进行后期优化
    }
}