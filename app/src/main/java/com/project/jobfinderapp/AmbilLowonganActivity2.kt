package com.project.jobfinderapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class AmbilLowonganActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ambil_lowongan2)

        val backBtn = findViewById<ImageView>(R.id.btn_backAmbil2)

        // Set a click listener for the back button
        backBtn.setOnClickListener {
            val intent = Intent(this, DeskripsiAppliedActivity::class.java)
            startActivity(intent)
        }
    }
}