package com.example.parcialgrupo1.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import com.example.parcialgrupo1.R



class Fragment_login1 : Fragment() {
    lateinit var v:View
    lateinit var btninicio: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle? ): View? {

        v =  inflater.inflate(R.layout.fragment_login1, container, false)
        btninicio = v.findViewById(R.id.btn_splash)
        return v
    }

    override fun onStart() {
        super.onStart()
        btninicio.setOnClickListener {
            val action = Fragment_login1Directions.actionFragmentLogin1ToFragmentLogin2()
            v.findNavController().navigate(action)
        }
    }

}