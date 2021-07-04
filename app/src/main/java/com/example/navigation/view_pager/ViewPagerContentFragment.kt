package com.example.navigation.view_pager

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.navigation.R
import com.example.navigation.view_pager.ViewPagerAdapter.Companion.ARG_OBJECT

class ViewPagerContentFragment : Fragment(R.layout.fragment_content_view_pager){
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        arguments?.takeIf {it.containsKey(ARG_OBJECT)}?.apply {
            val textView: TextView = view.findViewById(R.id.ViewPagerContentTextView)
            textView.text = "Tab fragment №${getInt(ARG_OBJECT)}"
        }
    }
}