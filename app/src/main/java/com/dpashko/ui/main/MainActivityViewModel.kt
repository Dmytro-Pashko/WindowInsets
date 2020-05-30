package com.dpashko.ui.main

import android.util.Log
import androidx.lifecycle.ViewModel
import com.dpashko.components.ComponentA
import com.dpashko.components.ComponentB
import javax.inject.Inject

class MainActivityViewModel @Inject constructor(
    private val componentA: ComponentA,
    private val componentB: ComponentB
) : ViewModel() {

    init {
        Log.d("MainActivityViewModel", "ComponentA injected into MainActivityViewModel=$componentA")
        Log.d("MainActivityViewModel", "ComponentB injected into MainActivityViewModel=$componentB")
    }
}