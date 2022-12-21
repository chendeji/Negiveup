package com.josephchen.negiveup.repository.db.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * ---------------------------------------------------------<br />
 * desc：数据库目标表结构<br />
 * author：陈德基 <br />
 * date：2022/12/13 16:59<br />
 * email：18701434169@163.com<br />
 * qq: 781571323
 * wx: melody_2009
 * ---------------------------------------------------------<br />
 */
@Entity
data class Goal(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "g_id")
    val id : Int = 0,
    @ColumnInfo(name = "g_title")
    val title: String,
    @ColumnInfo(name = "g_content")
    val content : String,
    @ColumnInfo(name = "g_img_url")
    val gImage : String = "",
    @ColumnInfo(name = "create_time")
    val createTime : Long,
    @ColumnInfo(name = "end_time")
    val endTime: Long,
    @ColumnInfo(name = "goal_status")
    val status: Int = -1
    )