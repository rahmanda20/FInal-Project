package com.example.smartparking

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class OnBoarding3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_boarding3)
    }

    fun login(view: View?) {
        val i = Intent(applicationContext, Login::class.java)
        startActivity(i)
    }
}