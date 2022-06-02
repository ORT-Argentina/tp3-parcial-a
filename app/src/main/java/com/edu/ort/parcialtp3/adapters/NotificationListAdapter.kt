package com.edu.ort.parcialtp3.adapters


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.edu.ort.parcialtp3.R
import com.edu.ort.parcialtp3.holders.NotificationHolder
import com.edu.ort.parcialtp3.models.Notification

class NotificationListAdapter(
    private var notificationList: MutableList<Notification>
) : RecyclerView.Adapter<NotificationHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NotificationHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_notification, parent, false)
        return NotificationHolder(view)
    }

    override fun onBindViewHolder(holder: NotificationHolder, position: Int) {
        holder.setTitle(notificationList[position].title)
    }

    override fun getItemCount(): Int {
        return notificationList.size
    }
    fun setData(newData : ArrayList<Notification>){
        this.notificationList = newData
        this.notifyDataSetChanged()
    }

}