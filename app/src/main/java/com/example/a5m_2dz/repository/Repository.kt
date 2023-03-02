package com.example.a5m_2dz.repository

import android.net.DnsResolver.Callback
import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.example.a5m_2dz.remote.LoveModel
import com.example.a5m_2dz.remote.LoveService
import retrofit2.Call
import retrofit2.Response

class Repository {

    fun getLove(firstName:String, secondName:String) : MutableLiveData<LoveModel> {
        val liveLoveData = MutableLiveData<LoveModel>()

        LoveService().api.calculatePercentage(firstName, secondName).enqueue(object : retrofit2.Callback<LoveModel> {
            override fun onResponse(call: Call<LoveModel>, response: Response<LoveModel>) {
                if (response.isSuccessful) {
                    liveLoveData.postValue(response.body())
                }
            }

            override fun onFailure(call: Call<LoveModel>, t: Throwable) {
                Log.e("ololo", "onFailure: ${t.message}" )
            }

        })

        return liveLoveData
    }
}