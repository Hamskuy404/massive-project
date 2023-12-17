package com.project.jobfinderapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewHomeHorizontalAdapter(private val dataList: List<String>) :
    RecyclerView.Adapter<RecyclerViewHomeHorizontalAdapter.ViewHolder>() {

    private var selectedPosition = RecyclerView.NO_POSITION

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_home_horizontal, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val relativeLayout: RelativeLayout = itemView.findViewById(R.id.imageViewHorizontal)
        private val textView: TextView = itemView.findViewById(R.id.txtViewHorizontal)

        fun bind(item: String, position: Int) {
            // Bind data to views
            textView.text = item

            // Change background color if the item is selected
            relativeLayout.isSelected = position == selectedPosition

            // Set click listener
            itemView.setOnClickListener {
                // Update selected position
                selectedPosition = adapterPosition

                // Notify item click
                onItemClick(adapterPosition)
            }
        }
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = dataList[position]
        holder.bind(item, position)
    }

    // Define an interface for item click events
    interface OnItemClickListener {
        fun onItemClick(position: Int)
    }

    // Create a listener variable
    private var onItemClickListener: OnItemClickListener? = null

    // Method to set the click listener
    fun setOnItemClickListener(listener: OnItemClickListener) {
        onItemClickListener = listener
    }

    // Notify item click through the listener
    private fun onItemClick(position: Int) {
        onItemClickListener?.onItemClick(position)
        notifyDataSetChanged() // Notify data set changed to refresh the views
    }
}
