package com.example.projetodiogo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class welcome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
        val continuar = findViewById<Button>(R.id.button2)
        continuar.setOnClickListener {
            homepage()
        }
    }

    fun homepage() {
        val Homepage = Intent(this,homepage::class.java)
        startActivity(Homepage)
    }






}