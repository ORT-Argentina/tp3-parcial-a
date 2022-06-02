package edu.ort.tp3parcial_a.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import edu.ort.tp3parcial_a.R
import edu.ort.tp3parcial_a.holders.NotificationHolder

class NotificationsListAdapter(private var stringList:MutableList<String>) : RecyclerView.Adapter<NotificationHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NotificationHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_notification,parent,false)
        return (NotificationHolder(view))
    }

    override fun onBindViewHolder(holder: NotificationHolder, position: Int) {
        holder.setText(stringList[position])
    }

    override fun getItemCount(): Int {
        return 10
    }
}