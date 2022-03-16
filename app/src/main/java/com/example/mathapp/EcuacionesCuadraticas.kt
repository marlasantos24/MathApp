package com.example.mathapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class EcuacionesCuadraticas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ecuaciones_cuadraticas)

        val bvolverc= findViewById<Button>(R.id.bvolverc)
        bvolverc.setOnClickListener {
            finish()
        }
    }
}