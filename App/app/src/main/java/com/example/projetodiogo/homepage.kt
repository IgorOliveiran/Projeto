package com.example.projetodiogo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class homepage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homepage)


        val voltarlogin = findViewById<Button>(R.id.button3)
        voltarlogin.setOnClickListener {
            voltar()
        }
    }
    fun voltar() {
        val main = Intent(this,MainActivity::class.java)
        startActivity(main)
    }

}