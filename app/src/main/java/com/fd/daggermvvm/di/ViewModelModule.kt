package com.fd.daggermvvm.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.fd.daggermvvm.ui.main.MainViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule {
    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    abstract fun bindMainViewModel(mainViewModel: MainViewModel?): ViewModel?

    @Binds
    abstract fun bindViewModelFactory(factoryMain: ViewModelFactory?): ViewModelProvider.Factory?

}