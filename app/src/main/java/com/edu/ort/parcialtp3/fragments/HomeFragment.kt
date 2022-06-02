package com.edu.ort.parcialtp3.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import com.edu.ort.parcialtp3.R


class HomeFragment : Fragment() {
    lateinit var homeView: View
    lateinit var notificationsBtn : Button
    lateinit var settingsBtn : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        homeView =  inflater.inflate(R.layout.fragment_home, container, false)
        notificationsBtn = homeView.findViewById(R.id.notificationsBtn)
        settingsBtn = homeView.findViewById(R.id.settingsBtn)
        return homeView
    }

    override fun onStart() {
        super.onStart()
        notificationsBtn.setOnClickListener {
            val action = HomeFragmentDirections.actionHomeFragmentToNotifications()
            homeView.findNavController().navigate(action)
        }
        settingsBtn.setOnClickListener {
            val action = HomeFragmentDirections.actionHomeFragmentToSettingsActivity()
            homeView.findNavController().navigate(action)
        }
    }

}