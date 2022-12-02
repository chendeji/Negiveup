package com.josephchen.negiveup.common;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;

/**
 * ---------------------------------------------------------<br />
 * desc：<br />
 * author：陈德基 <br />
 * date：2022/12/2 16:56<br />
 * email：18701434169@163.com<br />
 * qq: 781571323
 * wx: melody_2009
 * ---------------------------------------------------------<br />
 */
public class BaseCompatActivity extends AppCompatActivity {

    protected void go(Class clazz) {
        startActivity(new Intent(this, clazz));
    }

}
