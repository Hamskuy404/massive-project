package com.project.jobfinderapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

data class DataModel2(
    val company: Int,
    val jobRole: String,
    val companyName: String,
    val companyAddress: String
)

interface  OnItemClickListener2{
    fun onItemClick(position: Int)
}

data class RecyclerViewAppliedVertical(private val dataList: List<DataModel2>) :
    RecyclerView.Adapter<RecyclerViewAppliedVertical.ViewHolder>() {

    private var onItemClickListener: OnItemClickListener2? = null

    fun setOnItemClickListener(listener: OnItemClickListener2){
        this.onItemClickListener = listener
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.vertical_applied, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = dataList[position]
        holder.bind(item)


        holder.itemView.setOnClickListener { onItemClickListener?.onItemClick(position) }
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val company : ImageView = itemView.findViewById(R.id.company)
        private val tvJobRole: TextView = itemView.findViewById(R.id.tvRoleJob)
        private val tvCompanyName: TextView = itemView.findViewById(R.id.tvNameComp)
        private val tvCompanyAddress: TextView = itemView.findViewById(R.id.tvAddressComp)

        fun bind(item: DataModel2) {
            // Bind data to views
            company.setImageResource(item.company)
            tvJobRole.text = item.jobRole
            tvCompanyName.text = item.companyName
            tvCompanyAddress.text = item.companyAddress
        }
    }
}
