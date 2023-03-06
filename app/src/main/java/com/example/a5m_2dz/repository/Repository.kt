package com.example.a5m_2dz.repository

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.example.a5m_2dz.remote.LoveApi
import com.example.a5m_2dz.remote.LoveModel
import retrofit2.Call
import retrofit2.Response
import javax.inject.Inject

class Repository @Inject constructor(val api: LoveApi) {

    fun getLove(firstName:String, secondName:String) : MutableLiveData<LoveModel> {
        val liveLoveData = MutableLiveData<LoveModel>()

         api.calculatePercentage(firstName, secondName).enqueue(object : retrofit2.Callback<LoveModel> {
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