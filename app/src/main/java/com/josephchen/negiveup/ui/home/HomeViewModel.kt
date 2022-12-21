package com.josephchen.negiveup.ui.home

import android.app.Application
import androidx.lifecycle.*
import com.josephchen.negiveup.repository.db.NegiveupDatabase
import com.josephchen.negiveup.repository.db.entity.Goal
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.cancellable
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.launch

class HomeViewModel(app:Application) : AndroidViewModel(app) {

    fun getGoals() = NegiveupDatabase
        .getInstance(getApplication())
        .goalDao()
        .getAllGoal()
        .flowOn(Dispatchers.IO)

    fun saveGoal(title : String, content : String, startTime: Long, endTime: Long) = viewModelScope.launch {
        val goal = Goal(title = title, content = content, createTime = startTime, endTime = endTime)
        NegiveupDatabase.getInstance(getApplication()).goalDao().insertGoal(goal)
    }

}