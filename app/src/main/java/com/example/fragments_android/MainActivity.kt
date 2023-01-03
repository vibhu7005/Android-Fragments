package com.example.fragments_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager

class MainActivity : AppCompatActivity() {
    lateinit var fragmentOne: FragmentOne
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            fragmentOne = FragmentOne()
            supportFragmentManager.beginTransaction()
                .add(R.id.root_frame, fragmentOne)
                .commit()
        } else {
            fragmentOne = supportFragmentManager.findFragmentById(R.id.root_frame) as FragmentOne
        }
    }
}