package com.example.koindependencyinjecttion

class MainRepositoryImpl(
    private val myApi: MyApi,
) : MainRepository {
    override fun doNetworkCall() {
        myApi.makeNetworkCall()
    }
}