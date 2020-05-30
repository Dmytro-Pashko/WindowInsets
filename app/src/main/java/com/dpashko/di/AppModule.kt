package com.dpashko.di

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.Reusable

@Module
class AppModule {

    @Reusable
    @Provides
    fun context(application: Application): Context = application.applicationContext
}
