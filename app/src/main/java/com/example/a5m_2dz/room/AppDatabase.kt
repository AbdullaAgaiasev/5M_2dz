package com.example.a5m_2dz.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.a5m_2dz.remote.LoveModel

@Database(entities = [LoveModel::class], version = 1 )
abstract  class AppDatabase : RoomDatabase() {

    abstract fun loveDao(): LoveDao

}