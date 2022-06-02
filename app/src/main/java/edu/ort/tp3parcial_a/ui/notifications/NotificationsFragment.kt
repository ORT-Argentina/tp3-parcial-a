package edu.ort.tp3parcial_a.ui.notifications

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import edu.ort.tp3parcial_a.R
import edu.ort.tp3parcial_a.adapters.NotificationsListAdapter
import edu.ort.tp3parcial_a.databinding.FragmentNotificationsBinding

class NotificationsFragment : Fragment() {

    private var _binding: FragmentNotificationsBinding? = null
    private lateinit var recycler : RecyclerView
    private lateinit var notificationsListAdapter : NotificationsListAdapter

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val notificationsViewModel =
            ViewModelProvider(this).get(NotificationsViewModel::class.java)

        _binding = FragmentNotificationsBinding.inflate(inflater, container, false)
        val root: View = binding.root
        recycler = root.findViewById(R.id.notifications_recycler)
        return root


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

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}