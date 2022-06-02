package com.edu.ort.parcialtp3.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.edu.ort.parcialtp3.R
import com.edu.ort.parcialtp3.adapters.NotificationListAdapter
import com.edu.ort.parcialtp3.models.Notification

class Notifications : Fragment() {

    lateinit var notificationsView: View

    lateinit var notificationsContainer : RecyclerView

    var notifications : MutableList<Notification> = ArrayList<Notification>()

    lateinit var linearLayoutManager: LinearLayoutManager

    lateinit var notificationListAdapter: NotificationListAdapter

    companion object{
        fun newInstance() = Notifications()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        notificationsView = inflater.inflate(R.layout.fragment_notifications, container, false)
        notificationsContainer = notificationsView.findViewById(R.id.notifications_recicler_view)
        return notificationsView
    }

    override fun onStart() {
        super.onStart()
        for (i in 1..10){
            notifications.add(Notification("asdasd", 1))
            notifications.add(Notification("asdasd", 2))
            notifications.add(Notification("asdadsasd", 3))
            notifications.add(Notification("asdasdasd", 4))
            notifications.add(Notification("sadasdsda", 5))
        }

        notificationsContainer.setHasFixedSize(true)
        linearLayoutManager = LinearLayoutManager(context)
        notificationsContainer.layoutManager = linearLayoutManager

        notificationListAdapter = NotificationListAdapter(notifications)
        notificationsContainer.adapter = notificationListAdapter
    }
}