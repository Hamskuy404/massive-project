package com.project.jobfinderapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.button.MaterialButton
import com.google.android.material.tabs.TabLayout

class DetailLowonganActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_lowongan)

        val tabLayout  = findViewById<TabLayout>(R.id.tabLayoutLowongan)
        val vp2 = findViewById<ViewPager2>(R.id.vpLowongan)
        val backBtn = findViewById<ImageView>(R.id.back_btn)

        val btn_LamarKerja = findViewById<MaterialButton>(R.id.btn_lamarkerja)

        // Set a click listener for the back button
        backBtn.setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }

        tabLayout.addTab(tabLayout.newTab().setText("Deskripsi"))
        tabLayout.addTab(tabLayout.newTab().setText("Persyaratan"))

        val fm = supportFragmentManager
        val adapterLowongan = ViewPagerAdapter(fm,lifecycle)
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

        btn_LamarKerja.setOnClickListener {
            val intent = Intent(this, AmbilLowonganActivity::class.java)
            startActivity(intent)
        }
    }
}