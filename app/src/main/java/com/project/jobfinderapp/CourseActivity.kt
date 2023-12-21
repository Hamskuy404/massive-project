package com.project.jobfinderapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class CourseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_course)
        val backBtn = findViewById<ImageView>(R.id.btn_back)

        // Set a click listener for the back button
        backBtn.setOnClickListener {
            onBackPressed()
        }

    }
}