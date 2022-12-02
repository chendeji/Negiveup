package com.josephchen.negiveup;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import com.josephchen.negiveup.common.BaseCompatActivity;
import com.josephchen.negiveup.databinding.ActivityMainBinding;
import com.josephchen.negiveup.utils.StatusBarUtil;

public class MainActivity extends BaseCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setStatusBarTranslucent();
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);
        // 设置应用顶部的actionbar的标题等
//        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(binding.navView, navController);
    }


    //    将StatusBar设置为透明
    public void setStatusBarTranslucent() {
        StatusBarUtil.setTransparent(this);
        StatusBarUtil.setLightMode(this);
    }

}