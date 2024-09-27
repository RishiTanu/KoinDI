package com.example.koindependencyinjecttion

import androidx.lifecycle.ViewModel


class MainViewModel(
    private val mainRepository: MainRepository
) : ViewModel() {

    fun doNetworkCall(){
        println("print something")
    }
}