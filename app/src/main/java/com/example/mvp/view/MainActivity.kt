package com.example.mvp.view

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.mvp.databinding.ActivityMainBinding
import com.example.mvp.presenter.Presenter

class MainActivity : AppCompatActivity(), MainActivityView {

    private lateinit var binding : ActivityMainBinding
    private  var presenter = Presenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        presenter = Presenter(context = applicationContext)
        presenter.initView(this)
//        presenter.updateView()
        onClick()
    }

    private fun onClick() {
        binding.btnIncrement.setOnClickListener {
            presenter.increment()
        }

        binding.btnDecrement.setOnClickListener {
            presenter.decrement()
        }
    }

    override fun onUpdateState(model: Int) {
        binding.tvCounter.text = model.toString()
    }

    override fun showToast() {
        Toast.makeText(this, "Поздравляем!", Toast.LENGTH_SHORT).show()
    }

    override fun changeColor(color: String) {
        binding.tvCounter.setTextColor(Color.parseColor(color))
    }
}