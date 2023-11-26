package com.project.jobfinderapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

data class DataModel(
    val jobRole: String,
    val companyName: String,
    val companyAddress: String
)

interface  OnItemClickListener{
    fun onItemClick(position: Int)
}

class RecyclerViewHomeVertical(private val dataList: List<DataModel>) :
    RecyclerView.Adapter<RecyclerViewHomeVertical.ViewHolder>() {

    private var onItemClickListener: OnItemClickListener? = null

    fun setOnItemClickListener(listener: OnItemClickListener){
        this.onItemClickListener = listener
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_vertical, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = dataList[position]
        holder.bind(item)

        holder.itemView.setOnClickListener {
            onItemClickListener?.onItemClick(position)
        }
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val tvJobRole: TextView = itemView.findViewById(R.id.tvRoleJob)
        private val tvCompanyName: TextView = itemView.findViewById(R.id.tvNameComp)
        private val tvCompanyAddress: TextView = itemView.findViewById(R.id.tvAddressComp)

        fun bind(item: DataModel) {
            // Bind data to views
            tvJobRole.text = item.jobRole
            tvCompanyName.text = item.companyName
            tvCompanyAddress.text = item.companyAddress
        }
    }
}
