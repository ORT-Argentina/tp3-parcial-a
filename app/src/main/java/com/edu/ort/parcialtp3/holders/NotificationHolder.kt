package com.edu.ort.parcialtp3.holders

import android.view.View
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.edu.ort.parcialtp3.R

class NotificationHolder (view : View) : RecyclerView.ViewHolder(view){

    private var v : View

    init{
        this.v = view
    }

    fun setTitle( title: String){
        val txt : TextView = v.findViewById(R.id.txt_title_notification)
        txt.text = title
    }

    fun getNotificationLayout() : CardView{
        return v.findViewById(R.id.card_item_notification)
    }
}