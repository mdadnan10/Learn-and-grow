package com.learning.learnandgrow.activity

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.*
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.fragment.app.Fragment
import com.google.android.material.navigation.NavigationView
import com.learning.learnandgrow.R
import com.learning.learnandgrow.fragment.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.drawer_header.*

class MainActivity : AppCompatActivity() {
    lateinit var sharedPreferences: SharedPreferences
    lateinit var actionBarDrawerToggle: ActionBarDrawerToggle
    var name: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sharedPreferences = getSharedPreferences("NAME", Context.MODE_PRIVATE)
        name = sharedPreferences.getString("name", "Name")

        Toast.makeText(this, "Welcome Back $name", Toast.LENGTH_SHORT).show()

        appBar.title = name
        setUpDrawerLayout()

        // Drawer User name
        val navigationView = findViewById<View>(R.id.navigationView) as NavigationView
        val headerView = navigationView.getHeaderView(0)
        val textviewUsername = headerView.findViewById<View>(R.id.profileName) as TextView
        textviewUsername.text = "Hello $name 🥳"

        val homeFragment = HomeFragment()
        val numbersFragment = NumbersFragment()
        val mpTableFragment = MpTableFragment()
        val practiceFragment = PracticeFragment()
        val lettersFragment = LettersFragment()
        val wordsFragment = WordsFragment()
        val writeWordsFragment = WriteWordsFragment()

        setCurrentFragment(homeFragment)

        btnHome.setOnClickListener {
            setCurrentFragment(homeFragment)
        }

        btnNaturalNumbers.setOnClickListener {
            setCurrentFragment(numbersFragment)
        }

        btnMpTable.setOnClickListener {
            setCurrentFragment(mpTableFragment)
        }

        btnMathPractice.setOnClickListener {
            setCurrentFragment(practiceFragment)
        }

        btnLetters.setOnClickListener {
            setCurrentFragment(lettersFragment)
        }

        btnLettersWithWords.setOnClickListener {
            setCurrentFragment(wordsFragment)
        }

        btnWriteWords.setOnClickListener {
            setCurrentFragment(writeWordsFragment)
        }

    }

    private fun setCurrentFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.mainFrame, fragment).commit()
        }
    }

    private fun setUpDrawerLayout() {
        setSupportActionBar(appBar)
        actionBarDrawerToggle =
            ActionBarDrawerToggle(this, mainDrawer, R.string.open_drawer, R.string.close_drawer)
        actionBarDrawerToggle.syncState()

        val homeFragment = HomeFragment()
        val numbersFragment = NumbersFragment()
        val mpTableFragment = MpTableFragment()
        val practiceFragment = PracticeFragment()
        val lettersFragment = LettersFragment()
        val wordsFragment = WordsFragment()
        val writeWordsFragment = WriteWordsFragment()

        navigationView.setNavigationItemSelectedListener {

            when (it.itemId) {
                R.id.btnMenuHome -> {
                    setCurrentFragment(homeFragment)
                    mainDrawer.closeDrawers()
                }

                R.id.btnMenuNumbers -> {
                    setCurrentFragment(numbersFragment)
                    mainDrawer.closeDrawers()
                }

                R.id.btnMenuMpTable -> {
                    setCurrentFragment(mpTableFragment)
                    mainDrawer.closeDrawers()
                }

                R.id.btnMenuPractice -> {
                    setCurrentFragment(practiceFragment)
                    mainDrawer.closeDrawers()
                }

                R.id.btnMenuLetters -> {
                    setCurrentFragment(lettersFragment)
                    mainDrawer.closeDrawers()
                }

                R.id.btnMenuLettersFor -> {
                    setCurrentFragment(wordsFragment)
                    mainDrawer.closeDrawers()
                }

                R.id.btnMenuWriteWords -> {
                    setCurrentFragment(writeWordsFragment)
                    mainDrawer.closeDrawers()
                }

                R.id.btnClearExit -> {
                    sharedPreferences.edit().clear().apply()
                    startActivity(Intent(this, StartActivity::class.java))
                    finish()
                }
            }

            return@setNavigationItemSelectedListener true
        }

    }

    private fun drawerAction() {

        val profileImg = findViewById<ImageView>(R.id.profileImg)
        val userName = findViewById<TextView>(R.id.profileName)
        val changeImg = findViewById<TextView>(R.id.changeProfile)

        profileImg.setOnClickListener {
            changeImg.visibility = View.VISIBLE
            Toast.makeText(this, "Select an Image", Toast.LENGTH_LONG).show()
        }

        userName.text = "Welcome $name"

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (actionBarDrawerToggle.onOptionsItemSelected(item)) {
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}