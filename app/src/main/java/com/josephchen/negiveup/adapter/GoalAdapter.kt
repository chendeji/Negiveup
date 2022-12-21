package com.josephchen.negiveup.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.josephchen.negiveup.adapter.viewholder.GoalViewHolder
import com.josephchen.negiveup.databinding.ItemHomeGoalLayoutBinding
import com.josephchen.negiveup.repository.db.entity.Goal

/**
 * ---------------------------------------------------------<br />
 * desc：<br />
 * author：陈德基 <br />
 * date：2022/12/13 20:49<br />
 * email：18701434169@163.com<br />
 * qq: 781571323
 * wx: melody_2009
 * ---------------------------------------------------------<br />
 */
class GoalAdapter(val cxt:Context) : RecyclerView.Adapter<GoalViewHolder>() {
    private val data = ArrayList<Goal>()
    fun setGoalList(goals:List<Goal>) {
        data.clear()
        data.addAll(goals)
        notifyDataSetChanged()
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GoalViewHolder {
        var binding = ItemHomeGoalLayoutBinding.inflate(LayoutInflater.from(cxt), parent, false)
        return GoalViewHolder(binding)
    }

    override fun onBindViewHolder(holder: GoalViewHolder, position: Int) {
        var binding = holder.binding as ItemHomeGoalLayoutBinding
        binding.tvGoalTitle.text = data[position].title
        binding.tvGoalContent.text = data[position].content
    }

    override fun getItemCount(): Int = data.size

}