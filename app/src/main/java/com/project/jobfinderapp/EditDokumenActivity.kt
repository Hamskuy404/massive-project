package com.project.jobfinderapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.google.android.material.button.MaterialButton

class EditDokumenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_dokumen)
        val backBtn = findViewById<ImageView>(R.id.btn_backAmbil)
        val btn_Simpan = findViewById<MaterialButton>(R.id.btn_simpan)


        // Set a click listener for the back button
        backBtn.setOnClickListener {
            onBackPressedDispatcher.onBackPressed()

        }

        btn_Simpan.setOnClickListener {
            val intent = Intent(this, DeskripsiAppliedActivity::class.java)
            startActivity(intent)
        }
    }
}