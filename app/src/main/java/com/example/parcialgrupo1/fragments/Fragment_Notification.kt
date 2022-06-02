package com.example.parcialgrupo1.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.example.parcialgrupo1.Notificacion
import com.example.parcialgrupo1.R
import com.example.parcialgrupo1.adapters.NotificacionAdapter

class Fragment_Notification : Fragment() {
    lateinit var v: View
    lateinit var viewRecListado: RecyclerView
    var notificacion : MutableList<Notificacion> = ArrayList<Notificacion>()

    companion object {
        fun newInstance() = Fragment_Notification().apply {
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        viewRecListado = v.findViewById(R.id.notificaciones)
        v= inflater.inflate(R.layout.fragment__notification, container, false)

        return v
    }
    override fun onStart(){

        super.onStart();

        for(i in 1..10) {
            notificacion.add(Notificacion("n $i"))
        }

        viewRecListado.setHasFixedSize(true);
        viewRecListado.layoutManager = LinearLayoutManager(context)
        viewRecListado.adapter = NotificacionAdapter(notificacion)

    }
}
