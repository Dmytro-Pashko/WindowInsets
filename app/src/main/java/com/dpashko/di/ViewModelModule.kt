package com.dpashko.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.dpashko.ui.main.MainActivityViewModel
import com.dpashko.ui.main.MainFragmentViewModel
import dagger.Binds
import dagger.MapKey
import dagger.Module
import dagger.multibindings.IntoMap
import kotlin.reflect.KClass

@Module
abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(MainActivityViewModel::class)
    internal abstract fun bindActivityViewModel(activityViewModel: MainActivityViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(MainFragmentViewModel::class)
    internal abstract fun bindFragmentViewModel(fragmentViewModel: MainFragmentViewModel): ViewModel

    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory
}

@MapKey
private annotation class ViewModelKey(val value: KClass<out ViewModel>)
