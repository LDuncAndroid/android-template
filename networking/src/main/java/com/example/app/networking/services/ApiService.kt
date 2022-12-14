package com.example.app.networking.services

import com.example.app.networking.model.AuthToken
import io.reactivex.rxjava3.core.Single
import retrofit2.http.POST

const val API_VERSION = "v1"

interface ApiService {

    @POST("/$API_VERSION/login")
    fun login(): Single<AuthToken>
}
