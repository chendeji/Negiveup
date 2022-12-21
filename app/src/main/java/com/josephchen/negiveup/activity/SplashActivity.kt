package com.josephchen.negiveup.activity

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import com.josephchen.negiveup.R
import com.josephchen.negiveup.common.BaseCompatActivity
import kotlinx.coroutines.delay

@SuppressLint("CustomSplashScreen")
class SplashActivity : BaseCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        lifecycleScope.launchWhenCreated {
            delay(800)
            go(MainActivity::class.java)
        }
    }
}