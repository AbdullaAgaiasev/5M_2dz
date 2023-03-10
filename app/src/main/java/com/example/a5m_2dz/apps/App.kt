package com.example.a5m_2dz.apps

import android.app.Application
import androidx.room.Database
import androidx.room.Room
import com.example.a5m_2dz.room.AppDatabase
import dagger.hilt.android.HiltAndroidApp


@HiltAndroidApp
class App : Application() {

    companion object{
        lateinit var appDatabase: AppDatabase
    }
    override fun onCreate() {
        super.onCreate()
        appDatabase = Room.databaseBuilder(applicationContext, AppDatabase::class.java,"love_table")
            .allowMainThreadQueries().build()
    }

}