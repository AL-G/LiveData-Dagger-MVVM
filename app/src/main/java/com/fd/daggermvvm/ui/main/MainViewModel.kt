package com.fd.daggermvvm.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class MainViewModel @Inject constructor() : ViewModel() {

    var message = MutableLiveData<String>()

    init {
        message.value = "Live Data"
    }

}