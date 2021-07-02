package com.example.navigation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.navigation.bottom_sheet.BottomSheetContainerFragment


class MainActivity : AppCompatActivity(R.layout.activity_main) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .add(R.id.host_fragment, BottomSheetContainerFragment()).commit()
        }
    }
}