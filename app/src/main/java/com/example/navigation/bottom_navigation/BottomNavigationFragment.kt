package com.example.navigation.bottom_navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import com.example.navigation.R
import com.google.android.material.bottomnavigation.BottomNavigationView


class BottomNavigationFragment : Fragment(R.layout.fragment_bottom_navigation) {
    lateinit var bottomNavigation:BottomNavigationView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = super.onCreateView(inflater, container, savedInstanceState)
        bottomNavigation = view!!.findViewById(R.id.bottom_navigation)
        bottomNavigation.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.to_home -> {
                    true
                }
                R.id.squares -> {
                    true
                }
                R.id.notification -> {
                    true
                }
                else -> false
            }
        }
        return view
    }

}