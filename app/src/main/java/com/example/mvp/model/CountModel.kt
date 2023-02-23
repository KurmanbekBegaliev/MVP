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

    fun changeColor(): String {
        val x = (1..4).random()
        return when (x) {
            1 -> "#FF000000"
            2 -> "#FF0000FF"
            3 -> "#FF00FF00"
            else -> "#FFFF0000"
        }
    }
}