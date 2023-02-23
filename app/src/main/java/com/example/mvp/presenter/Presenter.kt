package com.example.mvp.presenter

import com.example.mvp.model.ColorModel
import com.example.mvp.model.CountModel
import com.example.mvp.view.MainActivityView

class Presenter {

    private val countModel = CountModel()
    private val colors = ColorModel().colors
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
        val count = countModel.getCount()

        view.onUpdateState(count)
        if (count == 10) view.showToast()
        if (count == 15) changeColor()
    }

    private fun changeColor() {
        val x = (1..colors.size).random()
        view.changeColor(color = colors[x-1])

    }


}