package com.example.navigation.bottom_navigation

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import com.example.navigation.R
import com.example.navigation.bottom_navigation.content_fragments.BottomNavigationContentFragment1
import com.example.navigation.bottom_navigation.content_fragments.BottomNavigationContentFragment2
import com.example.navigation.bottom_navigation.content_fragments.BottomNavigationContentFragment3
import com.google.android.material.bottomnavigation.BottomNavigationView


class BottomNavigationContainerFragment : Fragment(R.layout.fragment_bottom_navigation) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        parentFragmentManager.beginTransaction().add(
            R.id.bottom_navigation_fragment_content,
            BottomNavigationContentFragment1()
        ).commit()

        val bottomNavigation:BottomNavigationView = view.findViewById(R.id.bottom_navigation)
        bottomNavigation.setOnNavigationItemSelectedListener { item ->
            Log.i(TAG, item.itemId.toString())
            when (item.itemId) {
                R.id.to_home -> {
                    parentFragmentManager.beginTransaction().replace(
                        R.id.bottom_navigation_fragment_content,
                        BottomNavigationContentFragment1()
                    ).commit()
                    true
                }
                R.id.squares -> {
                    parentFragmentManager.beginTransaction().replace(
                        R.id.bottom_navigation_fragment_content,
                        BottomNavigationContentFragment2()
                    ).commit()
                    true
                }
                R.id.notification -> {
                    parentFragmentManager.beginTransaction().replace(
                        R.id.bottom_navigation_fragment_content,
                        BottomNavigationContentFragment3()
                    ).commit()
                    true
                }
                else -> false
            }
        }
    }

    companion object {
        private const val TAG = "BottomNavigationContain"
    }

}