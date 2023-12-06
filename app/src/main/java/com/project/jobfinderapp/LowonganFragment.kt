package com.project.jobfinderapp

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class LowonganFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_lowongan, container, false)
        val notifBtn = view.findViewById<ImageView>(R.id.notifBtn)

        // Set a click listener for the back button
        notifBtn.setOnClickListener {
            val intent = Intent(context, NotifikasiActivity::class.java)
            startActivity(intent)
        }
        val recyclerViewHorizontal: RecyclerView = view.findViewById(R.id.recyclerViewHorizontal)
        val horizontalAdapter = RecyclerViewHomeHorizontalAdapter(
            listOf("Teknik", "Marketing", "Teknologi", "Farmasi", "Mandarin", "English")
        )
        horizontalAdapter.setOnItemClickListener(object : RecyclerViewHomeHorizontalAdapter.OnItemClickListener {
            override fun onItemClick(position: Int) {
            }
        })
        recyclerViewHorizontal.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        recyclerViewHorizontal.adapter = horizontalAdapter

        val recyclerViewVertical: RecyclerView = view.findViewById(R.id.recyclerViewVertical)
        val verticalAdapter = RecyclerViewHomeVertical(
            listOf(
                DataModel("Teknik", "PT. Teknik Jaya", "Jakarta"),
                DataModel("Marketing", "PT. Marketing Sukses", "Surabaya"),
                DataModel("Teknologi", "PT. Techno Mandiri", "Bandung"),
                DataModel("Farmasi", "PT. Farmasi Sehat", "Yogyakarta"),
                DataModel("Mandarin", "PT. Mandarin Language", "Beijing"),
                DataModel("English", "PT. English Experts", "London")
            )
        )
        recyclerViewVertical.layoutManager = LinearLayoutManager(context)
        recyclerViewVertical.adapter = verticalAdapter
        verticalAdapter.setOnItemClickListener(object : OnItemClickListener{
            override fun onItemClick(position: Int) {
                val intent = Intent(context, DetailLowonganActivity::class.java)
                startActivity(intent)
            }
        })

        return view
    }
}