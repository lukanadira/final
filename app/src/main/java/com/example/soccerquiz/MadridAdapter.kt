package com.example.soccerquiz

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class MadridAdapter (private val images: List<Madrid_images>): RecyclerView.Adapter<MadridAdapter.ImageViewHolder>() {

    class ImageViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        val imageview: ImageView = itemView.findViewById(R.id.image)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MadridAdapter.ImageViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_madridimages, parent, false)
        return MadridAdapter.ImageViewHolder(view)
    }

    override fun onBindViewHolder(holder: MadridAdapter.ImageViewHolder, position: Int) {
        val v = images[position]
        Glide.with(holder.imageview.context)
            .load(v.link)
            .centerCrop()
            .into(holder.imageview)
    }

    override fun getItemCount(): Int = images.size
}


