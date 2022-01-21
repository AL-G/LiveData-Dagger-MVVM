package com.fd.daggermvvm.di

import com.fd.daggermvvm.MainActivity
import com.fd.daggermvvm.di.scopes.ActivityScope
import com.fd.daggermvvm.ui.main.MainModule
import dagger.Module
import dagger.android.ContributesAndroidInjector
import javax.inject.Singleton

@Module
abstract class ActivityBindingModule {

    @ActivityScope
    @ContributesAndroidInjector(modules = [MainModule::class])
    abstract fun mainActivity(): MainActivity

}