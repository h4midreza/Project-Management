package com.example.projectmanagerapp.adapter

import android.content.res.ColorStateList
import android.graphics.PorterDuff
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.projectmanagerapp.R
import com.example.projectmanagerapp.domain.OngoingDomain

class OngoingAdapter(private val items: List<OngoingDomain>) :
    RecyclerView.Adapter<OngoingAdapter.ViewHolder>() {
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val title: TextView = itemView.findViewById(R.id.titleTxt)
        val date: TextView = itemView.findViewById(R.id.dateTxt)
        val progressBarPercent: TextView = itemView.findViewById(R.id.percentTxt)
        val progress: TextView = itemView.findViewById(R.id.progressTxt)
        val progressBar: ProgressBar = itemView.findViewById(R.id.progressBar)
        val pic: ImageView = itemView.findViewById(R.id.pic)
        val layout: ConstraintLayout = itemView.findViewById(R.id.layout)

        fun setTextColors(colorRes: Int) {
            title.setTextColor(itemView.context.getColor(colorRes))
            date.setTextColor(itemView.context.getColor(colorRes))
            progressBarPercent.setTextColor(itemView.context.getColor(colorRes))
            progress.setTextColor(itemView.context.getColor(colorRes))
            pic.setColorFilter(
                ContextCompat.getColor(itemView.context, colorRes),
                PorterDuff.Mode.SRC_IN
            )
            progressBar.progressTintList =
                ColorStateList.valueOf(ContextCompat.getColor(itemView.context, colorRes))
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OngoingAdapter.ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.viewholder_ongoing, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: OngoingAdapter.ViewHolder, position: Int) {
        val items = items[position]
        holder.title.text = items.title
        holder.date.text = items.date
        holder.progressBarPercent.text = "${items.progressPercent}"

        val drawableResourceId = holder.itemView.context.resources.getIdentifier(
            items.picPath, "drawable", holder.itemView.context.packageName
        )

        Glide.with(holder.itemView.context)
            .load(drawableResourceId)
            .into(holder.pic)

        holder.progressBar.progress = items.progressPercent

        with(holder) {
            if (position == 0) {
                layout.setBackgroundResource(R.drawable.dark_bg)
                setTextColors(R.color.white)
            } else {
                layout.setBackgroundResource(R.drawable.light_purple_bg)
                setTextColors(R.color.dark_purple)
            }
        }
    }

    override fun getItemCount(): Int = items.size
}