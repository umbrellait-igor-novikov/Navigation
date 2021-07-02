package com.example.navigation.initial_fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.navigation.R
import com.example.navigation.bottom_navigation.BottomNavigationContainerFragment

class SignInFragment : Fragment(R.layout.fragment_sign_in){
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val signInToMainButton = view.findViewById<Button>(R.id.button_from_sign_in_to_main)
        signInToMainButton.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.host_fragment, BottomNavigationContainerFragment())
                .addToBackStack(null)
                .commit()
        }
    }
}