package com.josephchen.negiveup.ui.home

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.*
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.josephchen.negiveup.activity.AddGoalActivity
import com.josephchen.negiveup.adapter.GoalAdapter
import com.josephchen.negiveup.databinding.FragmentHomeBinding
import com.josephchen.negiveup.databinding.FragmentSettingBinding
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.firstOrNull

class HomeFragment : Fragment() {
    private val binding: FragmentHomeBinding by lazy {
        FragmentHomeBinding.inflate(layoutInflater)
    }
    private val viewModel : HomeViewModel by viewModels()
    private lateinit var adapter : GoalAdapter
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        context?.apply {
            adapter = GoalAdapter(this)
            binding.rvHomeGoalsList.adapter = adapter
        }
        binding.apply {
            // 加载最新的目标列表
            flHomeEmpty.visibility = View.VISIBLE
            rvHomeGoalsList.visibility = View.GONE
            // 如果没有数据，就展示空数据UI
            flHomeEmpty.setOnClickListener {
                startActivity(Intent(this@HomeFragment.activity, AddGoalActivity::class.java))
            }
        }

        lifecycleScope.launchWhenCreated {
            viewModel.getGoals().collect{
                if (it.isNotEmpty()) {
                    binding.flHomeEmpty.visibility = View.GONE
                    binding.rvHomeGoalsList.visibility = View.VISIBLE
                    adapter.setGoalList(it)
                } else {
                    binding.flHomeEmpty.visibility = View.VISIBLE
                    binding.rvHomeGoalsList.visibility = View.GONE
                }
            }
        }

    }
}