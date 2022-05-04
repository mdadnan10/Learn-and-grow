package com.learning.learnandgrow.fragment

import android.app.Activity
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import com.learning.learnandgrow.R
import com.learning.learnandgrow.adapters.WordsAdapter
import com.learning.learnandgrow.models.Words
import com.learning.learnandgrow.models.WordsGif
import com.learning.learnandgrow.models.WordsNC
import kotlinx.android.synthetic.main.fragment_words.view.*

class WordsFragment : Fragment() {

    private lateinit var adapter: WordsAdapter
    private var wordsList = mutableListOf<Words>()
    private val wordsNCList = mutableListOf<WordsNC>()
    private val wordsGifList = mutableListOf<WordsGif>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_words, container, false)

        populateWords()
        wordsNC()
        wordsGif()
        setUpRecyclerView(view)

//        Toast.makeText(context as Activity, wordsList.size.toString(), Toast.LENGTH_LONG).show()
//        Toast.makeText(context as Activity, wordsNCList.size.toString(), Toast.LENGTH_LONG).show()
//        Toast.makeText(context as Activity, wordsGifList.size.toString(), Toast.LENGTH_LONG).show()

        return view
    }

    private fun populateWords() {

        wordsList.clear()

        wordsList.add(Words(R.drawable.a_for_nc, "Apple"))
        wordsList.add(Words(R.drawable.b_for_nc, "Ball"))
        wordsList.add(Words(R.drawable.c_for_nc, "Cat"))
    }

    private fun wordsNC() {

        wordsNCList.clear()

        wordsNCList.add(WordsNC(R.drawable.a_for_nc))
        wordsNCList.add(WordsNC(R.drawable.b_for_nc))
        wordsNCList.add(WordsNC(R.drawable.c_for_nc))
    }

    private fun wordsGif() {

        wordsGifList.clear()

        wordsGifList.add(WordsGif(R.drawable.a_cc))
        wordsGifList.add(WordsGif(R.drawable.b_cc))
        wordsGifList.add(WordsGif(R.drawable.c_cc))
    }

    private fun setUpRecyclerView(view: View) {

        adapter = WordsAdapter(context as Activity, wordsList, wordsNCList, wordsGifList)
        view.wordsRecyclerview.layoutManager = GridLayoutManager(context as Activity, 2)
        view.wordsRecyclerview.adapter = adapter

    }
}