package com.example.parcialgrupo1.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.example.parcialgrupo1.R
import com.example.parcialgrupo1.adapters.ViewPagerAdapter


class containerFragment : Fragment() {
    lateinit var v : View
    lateinit var viewPager2: ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        v=  inflater.inflate(R.layout.fragment_container, container, false)
        viewPager2 = v.findViewById(R.id.view_pager1)
        return v
    }

    override fun onStart() {
        super.onStart()
        viewPager2.adapter = ViewPagerAdapter(requireActivity())
    }

}