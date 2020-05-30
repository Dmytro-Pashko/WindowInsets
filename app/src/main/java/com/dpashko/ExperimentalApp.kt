package com.dpashko

import com.dpashko.di.DaggerAppComponent
import dagger.android.DaggerApplication

class ExperimentalApp : DaggerApplication() {

    override fun applicationInjector() = DaggerAppComponent.builder()
        .application(this)
        .build()
}
