package com.rizieq.mempo.utils

import com.rizieq.mempo.service.RetrofitClient
import com.rizieq.mempo.service.RetrofitService

class Common {
    companion object{
        val BASE_URL = ""


        fun getApi():RetrofitService? {
            return RetrofitClient.getClient(BASE_URL)?.create(
                RetrofitService::class.java)
        }

    }
}