package com.fd.daggermvvm.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.fd.daggermvvm.databinding.MainFragmentBinding
import com.fd.daggermvvm.di.scopes.ActivityScope
import javax.inject.Inject

@ActivityScope
class MainFragment @Inject constructor() : Fragment() {

    lateinit var viewModel: MainViewModel

    @JvmField
    @Inject
    var viewModelFactory: ViewModelProvider.Factory? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this)[MainViewModel::class.java]
    }

    override
    fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        val mainFragmentBinding = MainFragmentBinding.inflate(inflater, container, false)
        mainFragmentBinding.viewModel = viewModel
        return mainFragmentBinding.root
    }

}