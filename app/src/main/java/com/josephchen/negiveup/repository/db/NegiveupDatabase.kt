package com.josephchen.negiveup.repository.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.josephchen.negiveup.repository.db.dao.GoalDao
import com.josephchen.negiveup.repository.db.dao.TaskDao
import com.josephchen.negiveup.repository.db.entity.Goal
import com.josephchen.negiveup.repository.db.entity.GoalStatus
import com.josephchen.negiveup.repository.db.entity.Task

/**
 * ---------------------------------------------------------<br />
 * desc：<br />
 * author：陈德基 <br />
 * date：2022/12/13 17:19<br />
 * email：18701434169@163.com<br />
 * qq: 781571323
 * wx: melody_2009
 * ---------------------------------------------------------<br />
 */
@Database(entities = [Goal::class, GoalStatus::class, Task::class], version = 1, exportSchema = false)
abstract class NegiveupDatabase : RoomDatabase() {

    abstract fun goalDao() : GoalDao
    abstract fun taskDao() : TaskDao

    companion object {
        private const val DATABASE_NAME : String = "room_negiveup"
        private var instance: NegiveupDatabase? = null
        fun getInstance(cxt: Context):NegiveupDatabase {
            return instance ?: synchronized(this) {
                Room.databaseBuilder(cxt, NegiveupDatabase::class.java, DATABASE_NAME)
                    .build()
                    .also { instance = it }
            }
        }
    }
}