package com.example.fragments_android.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.fragments_android.R
import com.example.fragments_android.model.BarInfo
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var fragmentOne: FragmentOne? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("vaibhav", "onCreate")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState != null) {
            val fragment = supportFragmentManager.findFragmentById(R.id.fragment_container)
            if (fragment != null && fragment is FragmentOne) {
                fragmentOne = fragment
            }
        }
        btnAdd.setOnClickListener {
            fragmentOne = FragmentOne()
            val bundle = Bundle()
            val barInfo = BarInfo(arrayListOf("non","fof"))
            bundle.putParcelable("data", barInfo)
            fragmentOne?.arguments = bundle
            supportFragmentManager.beginTransaction().replace(R.id.root_frame, fragmentOne!!, "hey").addToBackStack("lol").commit()
        }
        btnRemove.setOnClickListener {
            if (supportFragmentManager.findFragmentById(R.id.root_frame) != null)
                fragmentOne = supportFragmentManager.findFragmentById(R.id.root_frame) as FragmentOne?
                supportFragmentManager.beginTransaction().remove(fragmentOne!!).commit()
        }
    }

    override fun onStart() {
        Log.d("vaibhav", "onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.d("vaibhav", "onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.d("vaibhav", "onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.d("vaibhav", "onStop")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d("vaibhav", "onDestroy")
        super.onDestroy()
    }

    override fun onRestart() {
        Log.d("vaibhav", "onRestart")
        super.onRestart()
    }

}