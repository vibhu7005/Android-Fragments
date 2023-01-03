package com.example.fragments_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var fragmentOne: FragmentOne? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState != null) {
            val fragment = supportFragmentManager.findFragmentById(R.id.root_frame)
            if (fragment != null && fragment is FragmentOne) {
                fragmentOne = fragment
            }
        }
        btnAdd.setOnClickListener {
            fragmentOne = FragmentOne()
            supportFragmentManager.beginTransaction().add(R.id.root_frame, fragmentOne!!).commit()
        }
        btnRemove.setOnClickListener {
            if (fragmentOne != null)
                supportFragmentManager.beginTransaction().remove(fragmentOne!!).commit()
        }
    }
}