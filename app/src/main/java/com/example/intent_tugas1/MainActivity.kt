package com.example.intent_tugas1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val pindahintent = findViewById<Button>(R.id.PindahIntent)
        pindahintent.setOnClickListener {
            Toast.makeText(this, "Pindah class di mulai", LENGTH_SHORT).show()
            val baba = Intent(this, IntentBaru::class.java)
            startActivity(baba)

        }
    }
}