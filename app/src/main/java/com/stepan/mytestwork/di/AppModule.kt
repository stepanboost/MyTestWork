//package com.example.mymemeapp.di
//
//import com.example.mymemeapp.data.remote.ApiInterface
//import retrofit2.Retrofit
//import retrofit2.converter.gson.GsonConverterFactory
//
//object AppModule {
//
//    fun baseUrl() = "https://run.mocky.io/v3/"
//
//    fun provideApiInterface(baseUrl: String): ApiInterface{
//          return Retrofit.Builder()
//                .baseUrl(baseUrl)
//                .addConverterFactory(GsonConverterFactory.create())
//                .build()
//                .create(ApiInterface::class.java)
//        }
//
//
//
//
//}
//
//
