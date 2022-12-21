package com.josephchen.negiveup.common

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity

/**
 * ---------------------------------------------------------<br></br>
 * desc：<br></br>
 * author：陈德基 <br></br>
 * date：2022/12/2 16:56<br></br>
 * email：18701434169@163.com<br></br>
 * qq: 781571323
 * wx: melody_2009
 * ---------------------------------------------------------<br></br>
 */
open class BaseCompatActivity : AppCompatActivity() {
    protected fun go(clazz: Class<*>?) {
        startActivity(Intent(this, clazz))
    }
}