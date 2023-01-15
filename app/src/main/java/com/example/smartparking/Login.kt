package com.example.smartparking

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    fun forgotpassword(view: View?) {
        val i = Intent(applicationContext, ForgotPassword::class.java)
        startActivity(i)
    }

    fun signIn(view: View?) {
        val i = Intent(applicationContext, MenuProfile::class.java)
        startActivity(i)
    }

    fun signUp(view: View?) {
        val i = Intent(applicationContext, Register::class.java)
        startActivity(i)
    }

    fun btnregister(view: View?) {
        val i = Intent(applicationContext, Login::class.java)
        startActivity(i)
    }

    fun signIn2(view: View?) {
        val i = Intent(applicationContext, Login::class.java)
        startActivity(i)
    }

}