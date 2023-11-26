package com.project.jobfinderapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout

class DetailPelatihanActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_pelatihan)

        val tabLayout  = findViewById<TabLayout>(R.id.tabLayoutLowongan)
        val vp2 = findViewById<ViewPager2>(R.id.vpLowongan)
        val backBtn = findViewById<ImageView>(R.id.back_btn)

        // Set a click listener for the back button
        backBtn.setOnClickListener {
            onBackPressed()
        }

        tabLayout.addTab(tabLayout.newTab().setText("Deskripsi"))
        tabLayout.addTab(tabLayout.newTab().setText("Persyaratan"))

        val fm = supportFragmentManager
        val adapterLowongan = ViewPagerPelatihanAdapter(fm,lifecycle)
        vp2.adapter = adapterLowongan

        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                vp2.setCurrentItem(tab!!.position)
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
                // Handle tab unselection
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
                // Handle tab reselection
            }
        })

        vp2.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback(){
            override fun onPageSelected(position: Int) {
                tabLayout.selectTab(tabLayout.getTabAt(position))
                super.onPageSelected(position)
            }
        })

    }
}