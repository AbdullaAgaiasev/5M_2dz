package com.example.a5m_2dz

import android.content.Context
import android.content.SharedPreferences

class Pref(context: Context) {
    private val pref : SharedPreferences? =
        context.getSharedPreferences("settings", Context.MODE_PRIVATE)

    fun isUserSeenOnBoarding() {
        pref?.edit()?.putBoolean(SEEN_KEY, true)?.apply()
    }

    fun isUserSeen(): Boolean {
        return pref!!.getBoolean(SEEN_KEY, false)
    }

    companion object {
        const val SEEN_KEY = "isShow"
    }
}