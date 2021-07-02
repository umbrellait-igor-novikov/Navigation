package com.example.navigation.bottom_sheet

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment
import com.example.navigation.R
import com.google.android.material.bottomsheet.BottomSheetBehavior

class BottomSheetContainerFragment : Fragment(R.layout.fragment_container_bottom_sheet) {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
//        val bottomSheetLayout = view.findViewById<ConstraintLayout>(R.id.bottom_sheet)
//        val bottomSheetBehavior = BottomSheetBehavior.from(bottomSheetLayout!!)
//
//        val showBottomSheetButton = view?.findViewById<Button>(R.id.show_bottom_sheet_button)
//
//        showBottomSheetButton?.setOnClickListener {
//
//        }

        return super.onCreateView(inflater, container, savedInstanceState)
    }

}