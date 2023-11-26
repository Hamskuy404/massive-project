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

class PelatihanFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_pelatihan, container, false)
        val notifBtn = view.findViewById<ImageView>(R.id.notifBtn)

        // Set a click listener for the back button
        notifBtn.setOnClickListener {
            val intent = Intent(context, NotifikasiActivity::class.java)
            startActivity(intent)
        }
        val recyclerViewHorizontal: RecyclerView = view.findViewById(R.id.recyclerViewHorizontal)
        val horizontalAdapter = RecyclerViewHomeHorizontalAdapter(
            listOf("Semua","Teknik", "Marketing", "Teknologi", "Farmasi", "Mandarin", "English")
        )
        horizontalAdapter.setOnItemClickListener(object : RecyclerViewHomeHorizontalAdapter.OnItemClickListener {
            override fun onItemClick(position: Int) {
            }
        })
        recyclerViewHorizontal.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        recyclerViewHorizontal.adapter = horizontalAdapter

        val cardOne = view.findViewById<ImageView>(R.id.card_one)
        val cardTwo = view.findViewById<ImageView>(R.id.card_two)

        cardOne.setOnClickListener {
            val intent = Intent(context, DetailPelatihanActivity::class.java)
            startActivity(intent)
        }
        cardTwo.setOnClickListener {
            val intent = Intent(context, DetailPelatihanActivity::class.java)
            startActivity(intent)
        }


        return view
    }


}