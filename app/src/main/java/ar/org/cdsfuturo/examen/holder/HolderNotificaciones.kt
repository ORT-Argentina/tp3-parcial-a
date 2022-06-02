package ar.org.cdsfuturo.examen.holder

import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import ar.org.cdsfuturo.examen.R

class HolderNotificaciones (v: View) : RecyclerView.ViewHolder(v) {
    private var view: View

    init {
        this.view = v
    }

    fun setData(texto: String, tiempo:String) {
        val txt: TextView = view.findViewById(R.id.txt_texto)
        txt.text = texto
        val txtTiempo: TextView = view.findViewById(R.id.txt_tiempo)
        txtTiempo.text = tiempo
    }

    fun getCardLayout(): CardView {
        return view.findViewById(R.id.card_package_item)
    }
}