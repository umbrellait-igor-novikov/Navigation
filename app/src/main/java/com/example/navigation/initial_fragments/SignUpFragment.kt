package com.example.navigation.initial_fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.navigation.R

class SignUpFragment : Fragment(R.layout.fragment_sign_up) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val signUpToSignInButton = view.findViewById<Button>(R.id.button_from_sign_up_to_sign_in)
        signUpToSignInButton.setOnClickListener {
            parentFragmentManager.beginTransaction().replace(R.id.host_fragment, SignInFragment()).addToBackStack(null).commit()
        }
    }
}