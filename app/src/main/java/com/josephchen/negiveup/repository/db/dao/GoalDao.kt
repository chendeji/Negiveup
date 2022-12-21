package com.josephchen.negiveup.repository.db.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.josephchen.negiveup.repository.db.entity.Goal
import kotlinx.coroutines.flow.Flow

/**
 * ---------------------------------------------------------<br />
 * desc：<br />
 * author：陈德基 <br />
 * date：2022/12/13 17:18<br />
 * email：18701434169@163.com<br />
 * qq: 781571323
 * wx: melody_2009
 * ---------------------------------------------------------<br />
 */
@Dao
interface GoalDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertGoal(goal: Goal)

    @Query("SELECT * FROM goal")
    fun getAllGoal() : Flow<List<Goal>>

    @Delete()
    suspend fun deleteGoal(goal: Goal)
}