package com.example.mvp.model

import android.content.Context

class CountModel(context: Context) {

    private var prefs = context.getSharedPreferences(
        "PREF",
        Context.MODE_PRIVATE
    )

//    private var count: Int = 0


    fun increment() {
        var count = getCount()
        prefs.edit().putInt("KEY", ++count).apply()
    }

    fun decrement() {
        var count = getCount()
        prefs.edit().putInt("KEY", --count).apply()
    }

    fun getCount() = prefs.getInt("KEY", 0)
}