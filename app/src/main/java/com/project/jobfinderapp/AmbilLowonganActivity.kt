package com.project.jobfinderapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.google.android.material.button.MaterialButton


class AmbilLowonganActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ambil_lowongan)

        val backBtn = findViewById<ImageView>(R.id.btn_backAmbil)
        val btn_KirimLamaran = findViewById<MaterialButton>(R.id.btn_kirimlamaran)


        // Set a click listener for the back button
        backBtn.setOnClickListener {
            onBackPressedDispatcher.onBackPressed()

        }

        btn_KirimLamaran.setOnClickListener {
            val intent = Intent(this, AmbilLowonganActivity2::class.java)
            startActivity(intent)
        }
    }
}