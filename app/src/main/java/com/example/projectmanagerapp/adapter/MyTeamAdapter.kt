package com.example.projectmanagerapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.projectmanagerapp.R
import com.example.projectmanagerapp.domain.TeamDomain

class MyTeamAdapter(private val items: List<TeamDomain>) :
    RecyclerView.Adapter<MyTeamAdapter.ViewHolder>() {
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val title: TextView = itemView.findViewById(R.id.titleTxt)
        val status: TextView = itemView.findViewById(R.id.statusTxt)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyTeamAdapter.ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.viewholder_team, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyTeamAdapter.ViewHolder, position: Int) {
        val items = items[position]
        holder.title.text = items.title
        holder.status.text = items.status

    }

    override fun getItemCount(): Int = items.size
}