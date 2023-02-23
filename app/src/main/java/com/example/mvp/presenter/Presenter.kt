package com.example.mvp.presenter

import com.example.mvp.view.MainActivityView
import com.example.mvp.model.CountModel

class Presenter {

    private val countModel = CountModel()
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

    private fun updateView() {
        view.onUpdateState(countModel.getCount())
    }

}