package com.example.projectmanagerapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.projectmanagerapp.R
import com.example.projectmanagerapp.domain.TeamDomain

class ArchiveAdapter(private val items: List<String>) :
    RecyclerView.Adapter<ArchiveAdapter.ViewHolder>() {
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val title: TextView = itemView.findViewById(R.id.titleTxt)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArchiveAdapter.ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.viewholder_archive, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ArchiveAdapter.ViewHolder, position: Int) {
        val items = items[position]
        holder.title.text = items

    }

    override fun getItemCount(): Int = items.size
}