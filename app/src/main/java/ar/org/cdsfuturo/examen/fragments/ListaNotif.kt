package ar.org.cdsfuturo.examen.fragments

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import ar.org.cdsfuturo.examen.R
import ar.org.cdsfuturo.examen.adapter.ListaNotifAdapter
import ar.org.cdsfuturo.examen.entity.Notificaciones
import com.google.android.material.snackbar.Snackbar

class ListaNotif : Fragment() {

    lateinit var v: View
    lateinit var recNotificaciones: RecyclerView
    var notificaciones: MutableList<Notificaciones> = ArrayList<Notificaciones>()
    private lateinit var linearLayoutManager: LinearLayoutManager
    private lateinit var listNotifAdapter: ListaNotifAdapter

    companion object {
        fun newInstance() = ListaNotif()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        v = inflater.inflate(R.layout.llista_notif, container, false)
        recNotificaciones = v.findViewById(R.id.rec_notifi)
        setHasOptionsMenu(true)
        return v
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.toolbar_main, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onStart() {
        super.onStart()

        notificaciones.add(Notificaciones("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer dignissim, lacus et.","2min"))
        notificaciones.add(Notificaciones("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer dignissim, lacus et.","2min"))
        notificaciones.add(Notificaciones("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer dignissim, lacus et.","2min"))
        notificaciones.add(Notificaciones("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer dignissim, lacus et.","2min"))
        notificaciones.add(Notificaciones("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer dignissim, lacus et.","2min"))
        notificaciones.add(Notificaciones("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer dignissim, lacus et.","2min"))
        notificaciones.add(Notificaciones("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer dignissim, lacus et.","2min"))

        //Configuración Obligatoria
        recNotificaciones.setHasFixedSize(true)
        linearLayoutManager = LinearLayoutManager(context)
        recNotificaciones.layoutManager = linearLayoutManager
        listNotifAdapter = ListaNotifAdapter(notificaciones) { x ->
            onItemClick(x)
        }
        recNotificaciones.adapter = listNotifAdapter
    }

    fun onItemClick(position: Int): Boolean {
        Snackbar.make(v, position.toString(), Snackbar.LENGTH_SHORT).show()
       // findNavController().navigate(ListaNotifDirections.actionListaNotif2ToConfiguracion2())
        return true
    }
}