package com.example.administrator.displayusertext

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        displayInfo()
    }

    fun displayInfo() {
        btnSubmit.setOnClickListener {
            var name = txtNameInput.text
            var age = txtAgeInput.text
            var movie = txtMovieInput.text

            lblDisplayInfo.setText("Hello " + name + "! You are " + age + " years old and your" +
                    " favorite movie is " + movie)
        }
    }
}
