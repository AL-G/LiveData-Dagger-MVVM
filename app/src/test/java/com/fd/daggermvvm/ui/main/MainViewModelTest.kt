package com.fd.daggermvvm.ui.main

import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.mockito.MockitoAnnotations

class MainViewModelTest {

    lateinit var mViewModel: MainViewModel

    @Before
    fun setup() {
        MockitoAnnotations.initMocks(this)
        mViewModel = MainViewModel()
    }

    @Test
    fun counterLiveDataInitiated(){
        assertEquals(mViewModel.message.value, "Live Data")
    }

}
