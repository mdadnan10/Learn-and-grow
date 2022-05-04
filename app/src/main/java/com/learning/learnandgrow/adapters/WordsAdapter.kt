package com.learning.learnandgrow.adapters

import android.content.Context
import android.media.MediaPlayer
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.learning.learnandgrow.R
import com.learning.learnandgrow.models.Words
import com.learning.learnandgrow.models.WordsGif
import com.learning.learnandgrow.models.WordsNC

class WordsAdapter(
    val context: Context,
    private val words: List<Words>,
    private val wordsNc: List<WordsNC>,
    private val wordsGif: List<WordsGif>
) :
    RecyclerView.Adapter<WordsAdapter.WordsViewHolder>() {

    private lateinit var playAudio: MediaPlayer

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WordsViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.words_item, parent, false)
        return WordsViewHolder(view)
    }

    override fun onBindViewHolder(holder: WordsViewHolder, position: Int) {

        holder.image.setImageResource(words[position].image)
        holder.name.text = words[position].name
    }

    override fun getItemCount(): Int {
        return words.size
    }

    inner class WordsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var image: ImageView = itemView.findViewById(R.id.btnFor)
        var name: TextView = itemView.findViewById(R.id.tvWordName)

    }
}