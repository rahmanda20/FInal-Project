package com.example.smartparking

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MenuProfile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_profile)
    }

    fun btnmenu(view: View?) {
        val i = Intent(applicationContext, MenuUtama::class.java)
        startActivity(i)
    }

}