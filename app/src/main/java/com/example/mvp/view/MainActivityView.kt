package com.example.mvp.view

interface MainActivityView {
    fun onUpdateState(model: Int)
    fun showToast()
    fun changeColor(color: String)
}