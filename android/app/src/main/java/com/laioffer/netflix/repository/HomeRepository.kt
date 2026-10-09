package com.laioffer.netflix.repository

import android.util.Log
import com.laioffer.netflix.datamodel.HomeResponse
import com.laioffer.netflix.network.NetworkApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton

// Data layer object that fetches the Home response.
@Singleton
class HomeRepository @Inject constructor(
    private val networkApi: NetworkApi
) {
    suspend fun getHomeFeed(): HomeResponse = withContext(Dispatchers.IO) {
        Log.d("Tim", Thread.currentThread().name + " 3")
        networkApi.getHome().execute().body()
            ?: error("Error Home Response")
    }
}