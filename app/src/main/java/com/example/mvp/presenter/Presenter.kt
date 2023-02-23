package com.example.mvp.presenter

import com.example.mvp.view.MainActivityView
import com.example.mvp.model.CountModel
import kotlin.random.Random

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
        val count = countModel.getCount()

        view.onUpdateState(count)

        if (count == 10) view.showToast()

        if (count == 15) changeColor()
    }

    private fun changeColor() {
        val x = (1..4).random()
        view.changeColor(
            when (x) {
                1 -> "#FF000000"
                2 -> "#FF0000FF"
                3 -> "#FF00FF00"
                else -> "#FFFF0000"
            }
        )

    }


}