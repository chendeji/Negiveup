package com.josephchen.negiveup.repository.db.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * ---------------------------------------------------------<br />
 * desc：目标状态的数据库表结构<br />
 * author：陈德基 <br />
 * date：2022/12/13 17:11<br />
 * email：18701434169@163.com<br />
 * qq: 781571323
 * wx: melody_2009
 * ---------------------------------------------------------<br />
 */
@Entity
data class GoalStatus(
    @PrimaryKey
    @ColumnInfo(name = "s_id")
    val status : Int,
    @ColumnInfo(name = "s_name")
    val statusName : String
)
