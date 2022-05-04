package com.learning.learnandgrow.fragment

import android.app.Activity
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.MediaController
import android.widget.VideoView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.learning.learnandgrow.R
import com.learning.learnandgrow.adapters.VideosAdapter
import com.learning.learnandgrow.models.Videos
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        val activity = context as Activity

        val videosList = mutableListOf<Videos>()
        videosList.add(Videos("Learn to Count from 0 to 9 🔢", R.drawable.video_1_thumb))
        videosList.add(Videos("Learn Alphabets from A to Z 🔡", R.drawable.video_2_thumb))
        videosList.add(Videos("Here is your favourite words 🐒", R.drawable.video_3_thumb))
        videosList.add(Videos("Video 4", R.drawable.d))
        videosList.add(Videos("Video 5", R.drawable.e))
        videosList.add(Videos("Video 6", R.drawable.f))
        videosList.add(Videos("Video 7", R.drawable.g))
        videosList.add(Videos("Video 8", R.drawable.h))
        videosList.add(Videos("Video 9", R.drawable.i))
        videosList.add(Videos("Video 10", R.drawable.j))

        val videoView = view.findViewById<RecyclerView>(R.id.videoRecyclerView)
        videoView.adapter = VideosAdapter(videosList)
        videoView.layoutManager = LinearLayoutManager(activity)

        return view
    }
}