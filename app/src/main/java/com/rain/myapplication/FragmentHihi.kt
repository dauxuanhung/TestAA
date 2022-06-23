package com.rain.myapplication

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.activity.OnBackPressedCallback
import androidx.activity.addCallback
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.findNavController

class FragmentHihi : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        Log.e("!2", "!@12")
        return inflater.inflate(R.layout.fragment_hihi, null, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.bt).setOnClickListener {
            findNavController().navigate(R.id.go_login)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.e("onDestroyView", "FragmentHihi")
    }

    override fun onResume() {
        super.onResume()
        Log.e("11111111111", "111111111111")
    }
}