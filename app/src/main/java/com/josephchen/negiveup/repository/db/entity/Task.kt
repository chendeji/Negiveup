package com.josephchen.negiveup.repository.db.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * ---------------------------------------------------------<br />
 * desc：数据库目标任务表结构<br />
 * author：陈德基 <br />
 * date：2022/12/13 17:02<br />
 * email：18701434169@163.com<br />
 * qq: 781571323
 * wx: melody_2009
 * ---------------------------------------------------------<br />
 */
@Entity
data class Task(
    @PrimaryKey
    @ColumnInfo(name = "t_id")
    val id : String,
    @ColumnInfo(name = "t_title")
    val title: String,
    @ColumnInfo(name = "t_content")
    val content : String,
    @ColumnInfo(name = "g_id")
    val goalId: String
)
