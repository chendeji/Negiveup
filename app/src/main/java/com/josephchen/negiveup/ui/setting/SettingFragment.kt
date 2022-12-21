package com.josephchen.negiveup.ui.setting

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.josephchen.negiveup.databinding.FragmentSettingBinding

class SettingFragment : Fragment() {
    private val binding: FragmentSettingBinding by lazy {
        FragmentSettingBinding.inflate(layoutInflater)
    }
    private val viewModel : SettingViewModel by viewModels()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            viewModel.text.observe(viewLifecycleOwner) {
                textSetting.text = it
            }
        }

    }

}