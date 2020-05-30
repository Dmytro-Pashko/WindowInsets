package com.dpashko.components

import android.content.Context
import android.util.Log
import dagger.Reusable
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ComponentA @Inject constructor(private val context: Context) {

    init {
        Log.d("ComponentA", "Initiated component=$this")
    }
}
