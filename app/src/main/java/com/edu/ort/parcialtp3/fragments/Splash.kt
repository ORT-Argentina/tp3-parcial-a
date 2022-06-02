package com.edu.ort.parcialtp3.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import com.edu.ort.parcialtp3.R

class Splash : Fragment() {

    lateinit var splashView : View
    lateinit var btnIngresar : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        splashView =  inflater.inflate(R.layout.fragment_splash, container, false)
        btnIngresar = splashView.findViewById(R.id.splash_btn_ingresar)
        return splashView
    }

    override fun onStart() {
        super.onStart()
        btnIngresar.setOnClickListener {
            val action = SplashDirections.actionSplashToLogin()
            splashView.findNavController().navigate(action)
        }
    }

}