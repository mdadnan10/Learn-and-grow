package com.learning.learnandgrow.fragment

import android.app.Activity
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.learning.learnandgrow.R
import com.learning.learnandgrow.adapters.WriteWordsAdapter
import com.learning.learnandgrow.models.WriteWord
import kotlinx.android.synthetic.main.fragment_write_words.view.*

class WriteWordsFragment : Fragment() {

    lateinit var adapter: WriteWordsAdapter
    private var wordsList = mutableListOf<WriteWord>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_write_words, container, false)

        words()
        setUpRecyclerView(view)

        return view
    }

    private fun words() {

        wordsList.clear()

        wordsList.add(WriteWord(R.drawable.apple, "A for"))
        wordsList.add(WriteWord(R.drawable.ant, "A for"))
        wordsList.add(WriteWord(R.drawable.ball, "B for"))
        wordsList.add(WriteWord(R.drawable.boat, "B for"))
        wordsList.add(WriteWord(R.drawable.cat, "C for"))
        wordsList.add(WriteWord(R.drawable.cow, "C for"))
        wordsList.add(WriteWord(R.drawable.dog, "D for"))
        wordsList.add(WriteWord(R.drawable.donkey, "D for"))
        wordsList.add(WriteWord(R.drawable.elephant, "E for"))
        wordsList.add(WriteWord(R.drawable.egg, "E for"))
        wordsList.add(WriteWord(R.drawable.fish, "F for"))
        wordsList.add(WriteWord(R.drawable.frog, "F for"))
        wordsList.add(WriteWord(R.drawable.goat, "G for"))
        wordsList.add(WriteWord(R.drawable.gorilla, "G for"))
        wordsList.add(WriteWord(R.drawable.hen, "H for"))
        wordsList.add(WriteWord(R.drawable.horse, "H for"))
        wordsList.add(WriteWord(R.drawable.igloo, "I for"))
        wordsList.add(WriteWord(R.drawable.ice, "I for"))
        wordsList.add(WriteWord(R.drawable.jug, "J for"))
        wordsList.add(WriteWord(R.drawable.juice, "J for"))
        wordsList.add(WriteWord(R.drawable.king, "K for"))
        wordsList.add(WriteWord(R.drawable.kangaroo, "K for"))
        wordsList.add(WriteWord(R.drawable.lion, "L for"))
        wordsList.add(WriteWord(R.drawable.lamb, "L for"))
        wordsList.add(WriteWord(R.drawable.mango, "M for"))
        wordsList.add(WriteWord(R.drawable.monkey, "M for"))
        wordsList.add(WriteWord(R.drawable.nest, "N for"))
        wordsList.add(WriteWord(R.drawable.nurse, "N for"))
        wordsList.add(WriteWord(R.drawable.onion, "O for"))
        wordsList.add(WriteWord(R.drawable.orange, "O for"))
        wordsList.add(WriteWord(R.drawable.parrot, "P for"))
        wordsList.add(WriteWord(R.drawable.penguin, "P for"))
        wordsList.add(WriteWord(R.drawable.queen, "Q for"))
        wordsList.add(WriteWord(R.drawable.queue, "Q for"))
        wordsList.add(WriteWord(R.drawable.rabbit, "R for"))
        wordsList.add(WriteWord(R.drawable.rat, "R for"))
        wordsList.add(WriteWord(R.drawable.snake, "S for"))
        wordsList.add(WriteWord(R.drawable.sun, "S for"))
        wordsList.add(WriteWord(R.drawable.tree, "T for"))
        wordsList.add(WriteWord(R.drawable.train, "T for"))
        wordsList.add(WriteWord(R.drawable.umbrella, "U for"))
        wordsList.add(WriteWord(R.drawable.unicorn, "U for"))
        wordsList.add(WriteWord(R.drawable.van, "V for"))
        wordsList.add(WriteWord(R.drawable.violin, "V for"))
        wordsList.add(WriteWord(R.drawable.watch, "W for"))
        wordsList.add(WriteWord(R.drawable.well, "W for"))
        wordsList.add(WriteWord(R.drawable.xylophone, "X for"))
        wordsList.add(WriteWord(R.drawable.x_ray, "X for"))
        wordsList.add(WriteWord(R.drawable.yak, "Y for"))
        wordsList.add(WriteWord(R.drawable.yo_yo, "Y for"))
        wordsList.add(WriteWord(R.drawable.zebra, "Z for"))
        wordsList.add(WriteWord(R.drawable.zoo, "Z for"))

    }

    private fun setUpRecyclerView(view: View) {

        adapter = WriteWordsAdapter(context as Activity, wordsList)
        view.writeWordsRecyclerView.layoutManager = GridLayoutManager(context as Activity, 2)
        view.writeWordsRecyclerView.adapter = adapter


    }
}