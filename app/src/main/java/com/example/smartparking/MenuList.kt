package com.example.smartparking

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MenuList : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_list)
    }

    fun back(view: View?) {
        val i = Intent(applicationContext, MenuUtama::class.java)
        startActivity(i)
    }

    fun basementparking(view: View?) {
        val i = Intent(applicationContext, MenuDetail::class.java)
        startActivity(i)
    }

    fun groundparking(view: View?) {
        val i = Intent(applicationContext, MenuDetail::class.java)
        startActivity(i)
    }

    fun lobbyparking(view: View?) {
        val i = Intent(applicationContext, MenuDetail::class.java)
        startActivity(i)
    }

    fun parkparking(view: View?) {
        val i = Intent(applicationContext, MenuDetail::class.java)
        startActivity(i)
    }

    fun basementparking2(view: View?) {
        val i = Intent(applicationContext, MenuDetail::class.java)
        startActivity(i)
    }

    fun basementparking3(view: View?) {
        val i = Intent(applicationContext, MenuDetail::class.java)
        startActivity(i)
    }

    fun basementparking4(view: View?) {
        val i = Intent(applicationContext, MenuDetail::class.java)
        startActivity(i)
    }
}