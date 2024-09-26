package com.example.koindependencyinjecttion

import retrofit2.http.GET

interface MyApi {

    @GET("api/login")
    fun makeNetworkCall(){

    }
}