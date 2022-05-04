package com.learning.learnandgrow.fragment

import android.annotation.SuppressLint
import android.app.Activity
import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.SeekBar
import android.widget.TextView
import androidx.annotation.RequiresApi
import com.learning.learnandgrow.R

class MpTableFragment : Fragment() {

    private lateinit var tableOf: TextView
    private lateinit var seekbar: SeekBar
    lateinit var listView: ListView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_mp_table, container, false)

        tableOf = view.findViewById(R.id.tableOf)
        seekbar = view.findViewById(R.id.seekBar)
        listView = view.findViewById(R.id.listView)

        populateTable(1)

        seekbar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                populateTable(progress)
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {

            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {

            }

        })

        return view
    }

    private fun populateTable(table: Int) {

        val tables = mutableListOf<String>()

        tableOf.text = "Multiplication Table of ${table.toString()}"

        for (i in 1..10) {
            tables.add("$table x $i = ${table * i}")
        }

        val adapter = ArrayAdapter<String>(context as Activity, android.R.layout.simple_list_item_1, tables)
        listView.adapter = adapter

    }
}