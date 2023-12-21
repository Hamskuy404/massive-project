package com.project.jobfinderapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MateriPelatihanActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_materi_pelatihan)

        val backBtn = findViewById<ImageView>(R.id.back_btn)
        val courseBtn = findViewById<ImageView>(R.id.btn_course)

        // Set a click listener for the back button
        backBtn.setOnClickListener {
            onBackPressed()
        }

        courseBtn.setOnClickListener {
            val intent = Intent(applicationContext, CourseActivity::class.java)
            startActivity(intent)
        }
    }
}