package com.example.mathapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bLineal = findViewById<Button>(R.id.bLineal)
        bLineal.setOnClickListener {
            var intent = Intent(this, EcuacionesLineales::class.java)
            startActivity(intent)
        }

        val bCuadraticas = findViewById<Button>(R.id.bCuadraticas)
        bCuadraticas.setOnClickListener {
            var intent = Intent(this, EcuacionesCuadraticas::class.java)
            startActivity(intent)
        }

    }
}