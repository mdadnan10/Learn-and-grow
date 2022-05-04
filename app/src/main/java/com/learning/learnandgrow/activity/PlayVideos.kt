package com.learning.learnandgrow.activity

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.MediaController
import com.learning.learnandgrow.R
import kotlinx.android.synthetic.main.activity_play_videos.*

class PlayVideos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        );
        setContentView(R.layout.activity_play_videos)

        val videoName: String = intent.getStringExtra("videoName").toString()
        val url = playVideo(videoName)

        val mediaController = MediaController(this)
        mediaController.setAnchorView(videoView)
        videoView.setMediaController(mediaController)
        videoView.setVideoURI(url)
        videoView.requestFocus()
        videoView.start()
    }

    private fun playVideo(videoName: String): Uri {
        when(videoName){
            "video_1" -> {
                return Uri.parse("android.resource://$packageName/${R.raw.video_1}")
            }
            "video_2" -> {
                return Uri.parse("android.resource://$packageName/${R.raw.video_2}")
            }
            "video_3" -> {
                return Uri.parse("android.resource://$packageName/${R.raw.video_3}")
            }
            "video_4" -> {
                return Uri.parse("android.resource://$packageName/${R.raw.video_3}")
            }
            "video_5" -> {
                return Uri.parse("android.resource://$packageName/${R.raw.video_3}")
            }
            "video_6" -> {
                return Uri.parse("android.resource://$packageName/${R.raw.video_3}")
            }
            "video_7" -> {
                return Uri.parse("android.resource://$packageName/${R.raw.video_3}")
            }
            "video_8" -> {
                return Uri.parse("android.resource://$packageName/${R.raw.video_3}")
            }
            "video_9" -> {
                return Uri.parse("android.resource://$packageName/${R.raw.video_3}")
            }
            "video_10" -> {
                return Uri.parse("android.resource://$packageName/${R.raw.video_3}")
            }
        }
        return Uri.parse("android.resource://$packageName/${R.raw.video_1}")
    }

}