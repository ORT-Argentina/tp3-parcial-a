package com.example.parcialgrupo1.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import com.example.parcialgrupo1.fragments.Fragment_Notification
import com.example.parcialgrupo1.fragments.Fragment_Setting
import com.example.parcialgrupo1.fragments.Fragment_home
import com.example.parcialgrupo1.fragments.Fragment_login1

class ViewPagerAdapter (fragmentActivity: FragmentActivity) : androidx.viewpager2.adapter.FragmentStateAdapter(fragmentActivity) {



    override fun createFragment(position: Int): androidx.fragment.app.Fragment {
        return when(position){
            0 -> Fragment_home()
            1 -> Fragment_Notification()
            2 -> Fragment_Setting()

            else -> Fragment_home()
        }
    }
    override fun getItemCount(): Int {
        return TAB_COUNT
    }
    companion object{
        private const val TAB_COUNT = 3
    }

}
