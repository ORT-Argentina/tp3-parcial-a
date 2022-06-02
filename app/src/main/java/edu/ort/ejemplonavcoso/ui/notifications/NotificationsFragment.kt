package edu.ort.ejemplonavcoso.ui.notifications

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import edu.ort.ejemplonavcoso.R
import edu.ort.ejemplonavcoso.adapters.NotificationsListAdapter

/**
 * A simple [Fragment] subclass.
 * Use the [NotificationsFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class NotificationsFragment : Fragment() {

    private lateinit var recycler : RecyclerView
    private lateinit var notificationsListAdapter : NotificationsListAdapter
    private lateinit var fragmentView : View

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        fragmentView = inflater.inflate(R.layout.fragment_notifications, container, false)
        recycler = fragmentView.findViewById(R.id.notifications_recycler)
        return fragmentView
    }

    override fun onStart() {
        super.onStart()
        var notificaciones : MutableList<String> = ArrayList<String>()
        for(i in 1..10){
            notificaciones.add(i.toString())
        }

        recycler.setHasFixedSize(true)
        recycler.layoutManager = LinearLayoutManager(context)
        notificationsListAdapter = NotificationsListAdapter(notificaciones)
        recycler.adapter = notificationsListAdapter
    }

}