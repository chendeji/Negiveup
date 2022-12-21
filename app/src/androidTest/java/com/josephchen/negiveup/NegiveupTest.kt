package com.josephchen.negiveup

import android.util.Log
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import com.josephchen.negiveup.repository.db.NegiveupDatabase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.runBlocking
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class NegiveupTest {

    @Test
    fun getAllGoal() = runBlocking {
        val context = InstrumentationRegistry.getInstrumentation().targetContext;
        NegiveupDatabase.getInstance(context).goalDao().getAllGoal().catch {
            Log.e("getUserInfo", it.message ?: "接口访问错误")
        }.flowOn(Dispatchers.IO).collect {
            Log.i("get all goal", it.isEmpty().toString())
        }
    }

}