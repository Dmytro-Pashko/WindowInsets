package com.dpashko.components

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ComponentB @Inject constructor(componentA: ComponentA) {

    init {
        Log.d("ComponentB", "Initiated component=$this with componentA=$componentA")
    }
}
