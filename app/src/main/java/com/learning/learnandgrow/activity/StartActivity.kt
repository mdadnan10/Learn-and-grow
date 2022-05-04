package com.learning.learnandgrow.activity

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.Toast
import com.google.android.material.textfield.TextInputLayout
import com.learning.learnandgrow.R
import kotlinx.android.synthetic.main.activity_start.*

class StartActivity : AppCompatActivity() {
    lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)

        sharedPreferences = getSharedPreferences("NAME", Context.MODE_PRIVATE)
        val isSaved = sharedPreferences.getBoolean("isSaved", false)

        if (isSaved) {
            etName.visibility = View.GONE
            btnStartLearning.visibility = View.GONE

            val name = sharedPreferences.getString("name", "Name")
            bannerContainer.visibility = View.VISIBLE
            userName.text = name

            Handler().postDelayed({
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish()
            }, 800)

        } else {
            etName.visibility = View.VISIBLE
            btnStartLearning.visibility = View.VISIBLE
        }

        btnStartLearning.setOnClickListener {
            save()
        }

    }

    private fun validateName(name: String, layout: TextInputLayout): Boolean {

        return if (name.isEmpty()) {
            layout.error = "Enter Your child name"
            false
        } else {
            layout.error = null
            true
        }

    }

    private fun save() {

        val layout = findViewById<View>(R.id.etName) as TextInputLayout
        val name = layout.editText?.text.toString().trim()

        if (!validateName(name, layout)) return

        savePreference(name)

        startActivity(Intent(this, MainActivity::class.java))
        finish()

        Toast.makeText(this, "Welcome $name", Toast.LENGTH_LONG).show()
    }

    private fun savePreference(name: String) {
        sharedPreferences.edit().putBoolean("isSaved", true).apply()
        sharedPreferences.edit().putString("name", name).apply()
    }

}