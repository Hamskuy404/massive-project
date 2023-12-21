package com.project.jobfinderapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.project.jobfinderapp.databinding.ActivityNotifikasiBinding

class NotifikasiActivity : AppCompatActivity() {
    private lateinit var binding:ActivityNotifikasiBinding
    private lateinit var recyclerView: RecyclerView
    private var notifikasiList = ArrayList<Notifikasi>()
    private lateinit var adapter: NotifikasiAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNotifikasiBinding.inflate(layoutInflater)
        setContentView(binding.root)

        recyclerView = findViewById(R.id.rv_notifikasi)

        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)


        val backBtn = findViewById<ImageView>(R.id.btn_back_notif)

        // Set a click listener for the back button
        backBtn.setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }

        addDataToList()
        adapter = NotifikasiAdapter(notifikasiList)
        recyclerView.adapter = adapter

    }
    private fun addDataToList() {
        notifikasiList.add(Notifikasi(R.drawable.notif_satu))
        notifikasiList.add(Notifikasi(R.drawable.notif_dua))
        notifikasiList.add(Notifikasi(R.drawable.notif_tiga))
        notifikasiList.add(Notifikasi(R.drawable.notif_empat))
        notifikasiList.add(Notifikasi(R.drawable.notif_lima))
        notifikasiList.add(Notifikasi(R.drawable.notif_enam))
    }
}