package com.example.a5m_2dz.remote

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

//{
//fname:"Aktan"
//sname:"Vika"
//percentage:"46"
//result:"Can choose someone better."
//}

@Entity(tableName = "love_model")
data class LoveModel(
    @SerializedName("fname")
    val firstName:String,
    @SerializedName("sname")
    val secondName:String,
    val percentage:String,
    val result:String,
    @PrimaryKey(autoGenerate = true)
    var id : Int?
) : java.io.Serializable