package com.example.mvp.presenter

import android.content.Context
import com.example.mvp.MainActivityView
import com.example.mvp.model.CountModel

class Presenter(context: Context) {

    private val countModel = CountModel(context)
    private lateinit var view : MainActivityView

    fun increment() {
        countModel.increment()
        updateView()
    }

    fun decrement() {
        countModel.decrement()
        updateView()
    }

    fun initView(view: MainActivityView) {
        this.view = view
    }

    fun updateView() {
        view.onUpdateState(countModel.getCount())
    }

}