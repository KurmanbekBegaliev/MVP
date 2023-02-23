package com.example.mvp.model

class CountModel {

//    private var prefs = context.getSharedPreferences(
//        "PREF",
//        Context.MODE_PRIVATE
//    )

    private var count: Int = 0

    fun increment() {
        count++
//        var count = getCount()
//        prefs.edit().putInt("KEY", ++count).apply()
    }

    fun decrement() {
        count--
//        var count = getCount()
//        prefs.edit().putInt("KEY", --count).apply()
    }

    fun getCount(): Int {
        return count
//        return prefs.getInt("KEY", 0)
    }
}