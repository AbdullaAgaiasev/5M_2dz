package com.example.a5m_2dz.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.a5m_2dz.remote.LoveModel
import com.example.a5m_2dz.repository.Repository

class LoveViewModel : ViewModel() {

    private val repository = Repository()

     fun getLiveLove(firstName:String, secondName:String) : LiveData<LoveModel> {
         return repository.getLove(firstName, secondName)
     }


}