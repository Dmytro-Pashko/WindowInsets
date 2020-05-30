package com.dpashko.ui.main

import android.util.Log
import androidx.lifecycle.ViewModel
import com.dpashko.components.ComponentB
import javax.inject.Inject

class MainFragmentViewModel @Inject constructor(private val componentB: ComponentB) : ViewModel() {

    init {
        Log.d("MainFragmentViewModel", "ComponentB injected into MainActivityViewModel=$componentB")
    }
}