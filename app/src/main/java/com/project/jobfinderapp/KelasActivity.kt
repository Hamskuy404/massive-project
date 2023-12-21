package com.project.jobfinderapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class KelasActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kelas)
        val backBtn = findViewById<ImageView>(R.id.back_btn)
        val materiPelatihanBtn = findViewById<ImageView>(R.id.btnMateriPelatihan)

        // Set a click listener for the back button
        backBtn.setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }

        materiPelatihanBtn.setOnClickListener {
            val intent = Intent(this, MateriPelatihanActivity::class.java)
            startActivity(intent)
        }
    }
}