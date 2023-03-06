package com.example.a5m_2dz

import android.content.Context
import android.widget.Toast

class Utils {

    fun showToast(context: Context) {
        Toast.makeText(context, "Приветствую вас уважаемый гость", Toast.LENGTH_SHORT).show()
    }
}