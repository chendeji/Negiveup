package com.josephchen.negiveup.ui.setting

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SettingViewModel : ViewModel() {
    private val mText: MutableLiveData<String?>

    init {
        mText = MutableLiveData()
        mText.value = "This is dashboard fragment"
    }

    val text: LiveData<String?>
        get() = mText
}