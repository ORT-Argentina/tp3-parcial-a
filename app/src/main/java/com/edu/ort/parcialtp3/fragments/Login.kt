package com.edu.ort.parcialtp3.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import com.edu.ort.parcialtp3.HomeActivity
import com.edu.ort.parcialtp3.R
import com.edu.ort.parcialtp3.SettingsActivity

class Login : Fragment() {

    lateinit var btnIngresar : Button
    lateinit var loginView : View
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
         loginView = inflater.inflate(R.layout.fragment_login, container, false)
        btnIngresar = loginView.findViewById(R.id.login_btn_ingresar)
        return loginView
    }

    override fun onStart() {
        super.onStart()

        btnIngresar.setOnClickListener {
            val action = LoginDirections.actionLoginToHomeFragment()
            loginView.findNavController().navigate(action)
        }
    }

}