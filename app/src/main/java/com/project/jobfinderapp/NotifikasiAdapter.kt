package com.project.jobfinderapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class NotifikasiAdapter (private var notifikasiList:List<Notifikasi>) : RecyclerView.Adapter<NotifikasiAdapter.NotifikasiViewHolder>(){
    class NotifikasiViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val iv_notifikasi : ImageView = itemView.findViewById(R.id.iv_notifikasi)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NotifikasiViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recyclerview_notifikasi , parent , false)
        return NotifikasiViewHolder(view)
    }

    override fun getItemCount(): Int {
        return notifikasiList.size
    }

    override fun onBindViewHolder(holder: NotifikasiViewHolder, position: Int) {
        val notifikasi = notifikasiList[position]
        holder.iv_notifikasi.setImageResource(notifikasi.image)
    }
}