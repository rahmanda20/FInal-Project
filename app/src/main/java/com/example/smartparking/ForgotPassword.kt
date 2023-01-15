package com.example.smartparking

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ForgotPassword : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)
    }

    fun tryanotherone(view: View?) {
        val i = Intent(applicationContext, Login::class.java)
        startActivity(i)
    }

    fun send(view: View?) {
        val i = Intent(applicationContext, VerifyEmail::class.java)
        startActivity(i)
    }
}