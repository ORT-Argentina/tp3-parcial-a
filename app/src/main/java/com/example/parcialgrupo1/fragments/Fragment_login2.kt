package com.example.parcialgrupo1.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.parcialgrupo1.R

class Fragment_login2 : Fragment() {
    lateinit var v: View
    lateinit var btn_login: Button

  //  override fun onCreate(savedInstanceState: Bundle?) {
  //        super.onCreate(savedInstanceState)
  //  }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_login2, container, false)
        btn_login = v.findViewById(R.id.btnIngresar)
        return v
    }

    override fun onStart() {
        super.onStart()
    }
}