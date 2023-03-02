package com.example.a5m_2dz.remote

import com.google.gson.annotations.SerializedName

//{
//fname:"Aktan"
//sname:"Vika"
//percentage:"46"
//result:"Can choose someone better."
//}

data class LoveModel(
    @SerializedName("fname")
    val firstName:String,
    @SerializedName("sname")
    val secondName:String,
    val percentage:String,
    val result:String
) : java.io.Serializable