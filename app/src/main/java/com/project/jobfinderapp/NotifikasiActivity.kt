package com.project.jobfinderapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class NotifikasiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notifikasi)

        val backBtn = findViewById<ImageView>(R.id.btn_back_notif)

        // Set a click listener for the back button
        backBtn.setOnClickListener {
            onBackPressed()
        }
    }
}