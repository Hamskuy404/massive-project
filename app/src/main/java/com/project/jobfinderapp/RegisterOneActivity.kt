package com.project.jobfinderapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RegisterOneActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_one)

        val btnLanjut = findViewById<Button>(R.id.btnLanjut)

        btnLanjut.setOnClickListener {
            val intent = Intent(this, RegisterTwoActivity::class.java)
            startActivity(intent)
        }
    }
}