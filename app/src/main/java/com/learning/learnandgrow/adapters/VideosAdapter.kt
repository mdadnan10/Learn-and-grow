package com.learning.learnandgrow.adapters

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.learning.learnandgrow.R
import com.learning.learnandgrow.activity.PlayVideos
import com.learning.learnandgrow.models.Videos

class VideosAdapter(private val list: List<Videos>) :
    RecyclerView.Adapter<VideosAdapter.VideoViewHolder>() {
    lateinit var context: Context
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VideoViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.videos_list, parent, false)
        context = view.context
        return VideoViewHolder(view)
    }

    override fun onBindViewHolder(holder: VideoViewHolder, position: Int) {
        val name = list[position].videoName

        holder.videoName.text = name
        holder.videoImage.setImageResource(list[position].image)

        holder.itemView.setOnClickListener {
            val videoNo = position + 1;
            val videoPlay = "video_$videoNo"

            Toast.makeText(context, "Playing $name", Toast.LENGTH_SHORT).show()
            val intent = Intent(context, PlayVideos::class.java).apply {
                putExtra("videoName", videoPlay)
            }
            context.startActivity(intent)
        }

    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class VideoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val videoName: TextView = itemView.findViewById(R.id.video_heading)
        val videoImage: ImageView = itemView.findViewById(R.id.videoImage)
    }
}