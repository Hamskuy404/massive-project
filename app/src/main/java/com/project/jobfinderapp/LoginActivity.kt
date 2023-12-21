package com.project.jobfinderapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView



class LoginActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btnLogin = findViewById<TextView>(R.id.btnLogin)
        val btnRegis = findViewById<Button>(R.id.btnRegister)

        btnLogin.setOnClickListener {
            val intent = Intent(this, MainHomeActivity::class.java)
            startActivity(intent)
        }

        btnRegis.setOnClickListener {
            val intent = Intent(this, MainHomeActivity::class.java)
            startActivity(intent)
        }

    }
}