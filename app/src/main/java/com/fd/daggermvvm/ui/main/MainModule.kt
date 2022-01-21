package com.fd.daggermvvm.ui.main

import android.app.Activity
import android.content.Context
import androidx.navigation.NavController
import androidx.navigation.findNavController
import com.fd.daggermvvm.R
import com.fd.daggermvvm.di.scopes.ActivityScope
import com.fd.daggermvvm.di.scopes.FragmentScope
import com.fd.daggermvvm.ui.main.MainModule.MainAbstractModule
import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector

@Module(includes = [MainAbstractModule::class])
class MainModule {

    @ActivityScope
    @Provides
    fun provideNavController(context: Context): NavController = lazy {
        (context as Activity).findNavController(R.navigation.main)
    }.value

    @Module
    interface MainAbstractModule {
        @FragmentScope
        @ContributesAndroidInjector
        fun mainFragment(): MainFragment
    }

}