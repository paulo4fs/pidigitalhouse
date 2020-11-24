package com.renan.digitalspace.apod.repository

import com.renan.digitalspace.apod.data.NetworkUtilsApod
import com.renan.digitalspace.apod.model.ApodResponseModel
import retrofit2.http.GET
import retrofit2.http.Query
import java.text.SimpleDateFormat
import java.util.*

interface ApodEndPoint {

//    val date = Calendar.getInstance().time
//
//    val dateTimeFormatter = SimpleDateFormat("yyyy-dd-MM", Locale.getDefault())
//
//    return dateTimeFormatter.format(date)





    @GET("planetary/apod")
    suspend fun getAstronomicalFact(
        @Query("api_key") api_key: String = "gAFkqlGusIgjAzp0UrMhjbkqYfzlyq5jRL8BeBjv",
        @Query("date") date: String = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(Calendar.getInstance().time)
    ): ApodResponseModel

    companion object {
        val endpoint: ApodEndPoint by lazy {
            NetworkUtilsApod.getRetroFitInstance().create(ApodEndPoint::class.java)
        }
    }
}