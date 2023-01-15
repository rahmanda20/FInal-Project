package com.example.smartparking

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MenuDetail2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_detail2)
    }

    fun back1(view: View?) {
        val i = Intent(applicationContext, MenuList::class.java)
        startActivity(i)
    }

    fun lokasi(view: View?) {
        val i = Intent(applicationContext, MenuDetail3::class.java)
        startActivity(i)
    }
}