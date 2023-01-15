package com.example.smartparking

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MenuUtama : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_utama)
    }

    fun profile(view: View?) {
        val i = Intent(applicationContext, MenuProfile::class.java)
        startActivity(i)
    }

    fun btnmenu1(view: View?) {
        val i = Intent(applicationContext, About::class.java)
        startActivity(i)
    }

    fun btncar(view: View?) {
        val i = Intent(applicationContext, MenuList::class.java)
        startActivity(i)
    }

    fun btnbike(view: View?) {
        val i = Intent(applicationContext, MenuList::class.java)
        startActivity(i)
    }

    fun btnbus(view: View?) {
        val i = Intent(applicationContext, MenuList::class.java)
        startActivity(i)
    }

    fun btnvan(view: View?) {
        val i = Intent(applicationContext, MenuList::class.java)
        startActivity(i)
    }

    fun btnhotel(view: View?) {
        val i = Intent(applicationContext, MenuList::class.java)
        startActivity(i)
    }

}