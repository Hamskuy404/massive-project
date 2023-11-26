package com.project.jobfinderapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainHomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_home)

        val bottom_nav = findViewById<BottomNavigationView>(R.id.bottomNavigationView)

        bottom_nav.setOnNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.menu_item1 -> {
                    // Handle item 1 selection
                    loadFragment(HomeFragment())
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.menu_item2 -> {
                    // Handle item 2 selection
                    loadFragment(LowonganFragment())
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.menu_item3 -> {
                    // Handle item 2 selection
                    loadFragment(PelatihanFragment())
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.menu_item4 -> {
                    // Handle item 2 selection
                    loadFragment(KarirFragment())
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.menu_item5 -> {
                    // Handle item 2 selection
                    loadFragment(ProfilFragment())
                    return@setOnNavigationItemSelectedListener true
                }
                // Add more cases for other items as needed
                else -> return@setOnNavigationItemSelectedListener false
            }
        }


        // Set default selection
        bottom_nav.selectedItemId = R.id.menu_item1
    }

    private fun loadFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.container, fragment)
            .commit()
    }
}