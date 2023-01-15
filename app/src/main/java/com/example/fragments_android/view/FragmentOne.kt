package com.example.fragments_android.view

import android.content.Context
import android.os.Bundle
import android.os.Parcelable
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.fragments_android.R
import com.example.fragments_android.model.BarInfo

class FragmentOne : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("vaibhav", "F onCreateView")
        return inflater.inflate(R.layout.fragment_one, container, false)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("vaibhav", "F onCreate")
        super.onCreate(savedInstanceState)
    }

    override fun onAttach(context: Context) {
        Log.d("vaibhav", "F onAttach")
        super.onAttach(context)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Log.d("vaibhav", "F onViewCreated")
        super.onViewCreated(view, savedInstanceState)
        val data = arguments?.getParcelable<BarInfo>("data")
        Log.d("vaibhav data", ""+data?.list?.size.toString())
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        Log.d("vaibhav", "F onActivityCreated")
        super.onActivityCreated(savedInstanceState)
    }

    override fun onStart() {
        Log.d("vaibhav", "F onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.d("vaibhav", "F onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.d("vaibhav", "F onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.d("vaibhav", "F onStop")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d("vaibhav", "F onDestroy")
        super.onDestroy()
    }

    override fun onDestroyView() {
        Log.d("vaibhav", "F onDestroyView")
        super.onDestroyView()
    }

    override fun onDetach() {
        Log.d("vaibhav", "F onDetach")
        super.onDetach()
    }

}