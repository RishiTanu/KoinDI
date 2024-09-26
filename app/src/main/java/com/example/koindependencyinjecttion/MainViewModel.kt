package com.example.koindependencyinjecttion

import androidx.lifecycle.ViewModel


class MainViewModel(
    private val mainRepository: MainRepository
) : ViewModel() {


    init {
        mainRepository.doNetworkCall()
    }
}