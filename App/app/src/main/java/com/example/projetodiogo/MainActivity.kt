package com.example.projetodiogo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val login = findViewById<Button>(R.id.button)
        login.setOnClickListener {
            welcome()
        }


    }
    fun welcome() {
        val Welcome = Intent(this,welcome::class.java)
        startActivity(Welcome)
    }




}