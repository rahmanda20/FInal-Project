package com.example.smartparking

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class About : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
    }

    fun profile(view: View?) {
        val i = Intent(applicationContext, MenuProfile::class.java)
        startActivity(i)
    }

    fun btnback(view: View?) {
        val i = Intent(applicationContext, MenuUtama::class.java)
        startActivity(i)
    }
}