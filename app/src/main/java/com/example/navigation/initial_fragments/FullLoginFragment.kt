package com.example.navigation.initial_fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.navigation.R

class FullLoginFragment : Fragment(R.layout.fragment_full_login) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val signInButton = view.findViewById<Button>(R.id.button_sign_in)
        signInButton.setOnClickListener {
            parentFragmentManager.beginTransaction().replace(R.id.host_fragment, SignInFragment()).addToBackStack(null).commit()
        }

        val signUpButton = view.findViewById<Button>(R.id.button_sign_up)
        signUpButton.setOnClickListener {
            parentFragmentManager.beginTransaction().replace(R.id.host_fragment, SignUpFragment()).addToBackStack(null).commit()
        }
    }
}