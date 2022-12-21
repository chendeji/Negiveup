package com.josephchen.negiveup.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.widget.Toast
import androidx.activity.viewModels
import androidx.fragment.app.viewModels
import com.josephchen.negiveup.R
import com.josephchen.negiveup.databinding.ActivityAddGoalBinding
import com.josephchen.negiveup.ui.home.HomeViewModel

class AddGoalActivity : AppCompatActivity() {

    private val binding: ActivityAddGoalBinding by lazy {
        ActivityAddGoalBinding.inflate(layoutInflater)
    }

    private val viewModel: HomeViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.apply {
            // 让自定义的toolbar 和 系统的actionbar绑定关联
            tbAddToolbar.setOnMenuItemClickListener { it ->
                when (it.itemId) {
                    R.id.menu_home_save_goal -> {
                        // TODO: 执行目标信息的保存
                        viewModel.takeIf {
                            etAddGoalContent.text.toString()
                                .isNotEmpty() && etAddGoalTitle.text.toString().isNotEmpty()
                        }?.saveGoal(
                            etAddGoalTitle.text.toString(),
                            etAddGoalContent.text.toString(),
                            0L,
                            0L
                        ) ?: Toast.makeText(
                            this@AddGoalActivity,
                            "请完整填写目标内容",
                            Toast.LENGTH_LONG
                        ).show()
                        true
                    }
                    else -> {
                        true
                    }
                }
            }
        }
    }

}