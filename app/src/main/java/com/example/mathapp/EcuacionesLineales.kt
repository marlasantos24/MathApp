package com.example.mathapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class EcuacionesLineales : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ecuaciones_lineales)

        val bvolverl= findViewById<Button>(R.id.bvolverl)
        bvolverl.setOnClickListener {
            finish()
        }
    }
}