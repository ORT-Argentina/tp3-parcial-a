package edu.ort.tp3parcial_a.holders

import android.view.View
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import edu.ort.tp3parcial_a.R

class NotificationHolder (v: View) : RecyclerView.ViewHolder(v) {
    private var view: View

    init {
        this.view = v
    }

    fun setText(texto : String){
        val txt : TextView = view.findViewById(R.id.notifications_card_text)
        txt.text = texto
    }

    fun getCardLayout() : CardView {
        return view.findViewById(R.id.notifications_card_item)
    }
}