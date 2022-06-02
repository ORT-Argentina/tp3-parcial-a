package edu.ort.ejemplonavcoso.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import edu.ort.ejemplonavcoso.R
import edu.ort.ejemplonavcoso.holders.NotificationHolder

class NotificationsListAdapter(private var stringList:MutableList<String>) : RecyclerView.Adapter<NotificationHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NotificationHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_notification,parent,false)
        return (NotificationHolder(view))
    }

    override fun onBindViewHolder(holder: NotificationHolder, position: Int) {
        holder.setText(stringList[position])
        holder.setText2("2 min")
    }

    override fun getItemCount(): Int {
        return 10
    }
}