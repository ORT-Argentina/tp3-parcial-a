package com.example.parcialgrupo1.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.parcialgrupo1.Notificacion
import com.example.parcialgrupo1.R

class NotificacionAdapter(
    private var listanotificacion: MutableList<Notificacion>
) : RecyclerView.Adapter<NotificacionAdapter.NotificacionHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NotificacionHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.fragment__notification ,parent, false)
        return (NotificacionHolder(view))
    }

    override fun onBindViewHolder(holder: NotificacionHolder, position: Int) {
        holder.setNotif(listanotificacion[position].notif)
    }

    override fun getItemCount() =  listanotificacion.size

    class NotificacionHolder ( v: View) : RecyclerView.ViewHolder(v){

        private var vista : View

        init{
            this.vista = v
        }

        fun setNotif(name: String){
            val txtNombreView: TextView = vista.findViewById(R.id.txt_notif)
            txtNombreView.text = name
        }


    }

}