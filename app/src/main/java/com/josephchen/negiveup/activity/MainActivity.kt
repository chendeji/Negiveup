package com.josephchen.negiveup.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.josephchen.negiveup.R
import com.josephchen.negiveup.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        setStatusBarTranslucent()
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        apply {
            val navController = Navigation.findNavController(this,
                R.id.nav_host_fragment_activity_main
            )
            // 设置应用顶部的actionbar的标题等
            NavigationUI.setupWithNavController(binding.navView, navController)
        }

    }

    //    将StatusBar设置为透明
    fun setStatusBarTranslucent() {
//        StatusBarUtil.setLightMode(this)
    }
}