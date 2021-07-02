package com.example.navigation

import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import com.example.navigation.view_pager.ViewPagerContainerFragment


class MainActivity : AppCompatActivity(R.layout.activity_main) {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val drawerLayout:DrawerLayout = findViewById(R.id.drawer_layout)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .add(R.id.host_fragment, ViewPagerContainerFragment()).commit()
        }
    }
}
