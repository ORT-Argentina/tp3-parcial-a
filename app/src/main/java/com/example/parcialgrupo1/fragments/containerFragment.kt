package com.example.parcialgrupo1.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.example.parcialgrupo1.R
import com.example.parcialgrupo1.adapters.ViewPagerAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator


class containerFragment : Fragment() {
    lateinit var v : View
    lateinit var viewPager: ViewPager2
    lateinit var tabLayout: TabLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        v=  inflater.inflate(R.layout.fragment_container, container, false)
        tabLayout =  v.findViewById(R.id.Tab_layout)
        viewPager = v.findViewById(R.id.view_pager)
        return v
    }

    override fun onStart() {
        super.onStart()
        viewPager.setAdapter(ViewPagerAdapter(requireActivity()))


        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            when(position){
                0 -> {
                    tab.text = "HOME"
                    tab.setIcon(androidx.core.R.drawable.notify_panel_notification_icon_bg)
                    //tab.text
                }
                1 -> {
                    tab.text = "NOTIF"
                    //tab.orCreateBadge.isVisible = true
                    //tab.orCreateBadge.number = 3
                    tab.setIcon(androidx.core.R.drawable.notify_panel_notification_icon_bg)
                }
                2 -> {
                    tab.text = "SETTINGS"
                    tab.setIcon(androidx.core.R.drawable.notify_panel_notification_icon_bg)
                }
                else -> tab.text = "undefined"
            }
        }.attach()
    }

}