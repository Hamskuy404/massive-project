package com.project.jobfinderapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.project.jobfinderapp.MainHomeActivity
import com.project.jobfinderapp.R

class LowonganSentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ambil_lowongan)
        val btnKirimLamaran = findViewById<Button>(R.id.btn_kirimlamaran)

        btnKirimLamaran.setOnClickListener {
            val intent = Intent(this, AmbilLowonganActivity::class.java)
            startActivity(intent)
        }
    }

}