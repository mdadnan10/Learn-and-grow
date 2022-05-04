package com.learning.learnandgrow.adapters

import android.app.Activity
import android.content.Context
import android.media.MediaPlayer
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.learning.learnandgrow.R
import com.learning.learnandgrow.models.WriteWord
import java.util.*

class WriteWordsAdapter(val context: Context, val write: List<WriteWord>) :
    RecyclerView.Adapter<WriteWordsAdapter.WriteWordsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WriteWordsViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.write_words_item, parent, false)
        return WriteWordsViewHolder(view)
    }

    override fun onBindViewHolder(holder: WriteWordsViewHolder, position: Int) {

        holder.image.setImageResource(write[position].image)
        holder.writeFor.text = write[position].word

        val correct = MediaPlayer.create(context, R.raw.correct_answer)

        holder.writtenWord.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

            }

            override fun afterTextChanged(s: Editable?) {

                val word = s.toString().toLowerCase(Locale.ROOT).trim()

                if (holder.position == 0) {

                    if (word == "apple") {
                        correct.start()
                    }

                }

                if (holder.position == 1) {

                    if (word == "ant") {
                        correct.start()
                    }

                }

                if (holder.position == 2) {

                    if (word == "ball") {
                        correct.start()
                    }

                }

                if (holder.position == 3) {

                    if (word == "boat") {
                        correct.start()
                    }

                }

                if (holder.position == 4) {

                    if (word == "cat") {
                        correct.start()
                    }

                }

                if (holder.position == 5) {
                    if (word == "cow")
                        correct.start()
                }

                if (holder.position == 6) {

                    if (word == "dog") {
                        correct.start()
                    }

                }

                if (holder.position == 7) {

                    if (word == "donkey") {
                        correct.start()
                    }

                }

                if (holder.position == 8) {

                    if (word == "elephant") {
                        correct.start()
                    }

                }

                if (holder.position == 9) {

                    if (word == "egg") {
                        correct.start()
                    }

                }

                if (holder.position == 10) {

                    if (word == "fish") {
                        correct.start()
                    }

                }

                if (holder.position == 11) {

                    if (word == "frog") {
                        correct.start()
                    }

                }

                if (holder.position == 12) {

                    if (word == "goat") {
                        correct.start()
                    }

                }

                if (holder.position == 13) {

                    if (word == "gorilla") {
                        correct.start()
                    }

                }

                if (holder.position == 14) {

                    if (word == "hen") {
                        correct.start()
                    }

                }

                if (holder.position == 15) {

                    if (word == "horse") {
                        correct.start()
                    }

                }

                if (holder.position == 16) {

                    if (word == "igloo") {
                        correct.start()
                    }

                }

                if (holder.position == 17) {

                    if (word == "ice") {
                        correct.start()
                    }

                }

                if (holder.position == 18) {

                    if (word == "jug") {
                        correct.start()
                    }

                }

                if (holder.position == 19) {

                    if (word == "juice") {
                        correct.start()
                    }

                }

                if (holder.position == 20) {

                    if (word == "king") {
                        correct.start()
                    }

                }

                if (holder.position == 21) {

                    if (word == "kangaroo") {
                        correct.start()
                    }

                }

                if (holder.position == 22) {

                    if (word == "lion") {
                        correct.start()
                    }

                }

                if (holder.position == 23) {

                    if (word == "lamb") {
                        correct.start()
                    }

                }

                if (holder.position == 24) {

                    if (word == "mango") {
                        correct.start()
                    }

                }

                if (holder.position == 25) {

                    if (word == "monkey") {
                        correct.start()
                    }

                }

                if (holder.position == 26) {

                    if (word == "nest") {
                        correct.start()
                    }

                }

                if (holder.position == 27) {

                    if (word == "nurse") {
                        correct.start()
                    }

                }

                if (holder.position == 28) {

                    if (word == "onion") {
                        correct.start()
                    }

                }

                if (holder.position == 29) {

                    if (word == "orange") {
                        correct.start()
                    }

                }

                if (holder.position == 30) {

                    if (word == "parrot") {
                        correct.start()
                    }

                }

                if (holder.position == 31) {

                    if (word == "penguin") {
                        correct.start()
                    }

                }

                if (holder.position == 32) {

                    if (word == "queen") {
                        correct.start()
                    }

                }

                if (holder.position == 33) {

                    if (word == "queue") {
                        correct.start()
                    }

                }

                if (holder.position == 34) {

                    if (word == "rabbit") {
                        correct.start()
                    }

                }

                if (holder.position == 35) {

                    if (word == "rat") {
                        correct.start()
                    }

                }

                if (holder.position == 36) {

                    if (word == "snake") {
                        correct.start()
                    }

                }

                if (holder.position == 37) {

                    if (word == "sun") {
                        correct.start()
                    }

                }

                if (holder.position == 38) {

                    if (word == "tree") {
                        correct.start()
                    }

                }

                if (holder.position == 39) {

                    if (word == "train") {
                        correct.start()
                    }

                }

                if (holder.position == 40) {

                    if (word == "umbrella") {
                        correct.start()
                    }

                }

                if (holder.position == 41) {

                    if (word == "unicorn") {
                        correct.start()
                    }

                }

                if (holder.position == 42) {

                    if (word == "van") {
                        correct.start()
                    }

                }

                if (holder.position == 43) {

                    if (word == "violin") {
                        correct.start()
                    }

                }

                if (holder.position == 44) {

                    if (word == "watch") {
                        correct.start()
                    }

                }

                if (holder.position == 45) {

                    if (word == "well") {
                        correct.start()
                    }

                }

                if (holder.position == 46) {

                    if (word == "xylophone") {
                        correct.start()
                    }

                }

                if (holder.position == 47) {

                    if (word == "xray" || word == "x-ray") {
                        correct.start()
                    }

                }

                if (holder.position == 48) {

                    if (word == "yak") {
                        correct.start()
                    }

                }

                if (holder.position == 49) {

                    if (word == "yo yo" || word == "yoyo") {
                        correct.start()
                    }

                }

                if (holder.position == 50) {

                    if (word == "zebra") {
                        correct.start()
                    }

                }

                if (holder.position == 51) {

                    if (word == "zoo") {
                        correct.start()
                    }

                }

            }

        })

        holder.writtenWord.text.clear()

    }

    override fun getItemCount(): Int {
        return write.size
    }

    inner class WriteWordsViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {

        val image: ImageView = itemView.findViewById(R.id.writeImg)
        val writeFor: TextView = itemView.findViewById(R.id.writeFor)
        val writtenWord: EditText = itemView.findViewById(R.id.writtenWord)

    }
}