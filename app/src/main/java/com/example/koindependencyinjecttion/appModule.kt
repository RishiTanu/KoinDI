package com.example.koindependencyinjecttion

import androidx.lifecycle.viewmodel.compose.viewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

val appModule = module {
    single {
        Retrofit.Builder()
            .baseUrl("https://")
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
            .create(MyApi::class.java)
    }

    single<MainRepository> {
        MainRepositoryImpl(get())
    }

    viewModel {
        MainViewModel(get())
    }

    /*factory{
        MainRepositoryImpl(get())
    }*/

}