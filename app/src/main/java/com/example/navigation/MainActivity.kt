package com.example.navigation

import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import com.example.navigation.bottom_navigation.BottomNavigationContainerFragment
import com.example.navigation.bottom_sheet.BottomSheetContainerFragment
import com.example.navigation.initial_fragments.FullLoginFragment
import com.example.navigation.view_pager.ViewPagerContainerFragment
import com.google.android.material.navigation.NavigationView


class MainActivity : AppCompatActivity(R.layout.activity_main),NavigationView.OnNavigationItemSelectedListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val navigationView:NavigationView = findViewById(R.id.nav_view)
        navigationView.setNavigationItemSelectedListener(this)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .add(R.id.host_fragment, FullLoginFragment.newInstance())
                .addToBackStack(null)
                .commit()
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        Log.i(TAG, item.itemId.toString())
        return when(item.itemId){
            R.id.nav_view_pager -> {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.host_fragment, ViewPagerContainerFragment()).commit()
                true
            }
            R.id.nav_bottom_navigation -> {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.host_fragment, BottomNavigationContainerFragment()).commit()
                true
            }
            R.id.nav_bottom_sheet -> {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.host_fragment, BottomSheetContainerFragment()).commit()
                true
            }
            else -> false
        }
    }

    override fun onBackPressed() {
        when(supportFragmentManager.findFragmentById(R.id.host_fragment)){
            is BottomNavigationContainerFragment,is ViewPagerContainerFragment,is BottomSheetContainerFragment -> finish()
            else -> {
                super.onBackPressed()
            }
        }
    }

    companion object {
        private const val TAG = "MainActivity"
    }
}
