package ar.org.cdsfuturo.examen.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ar.org.cdsfuturo.examen.R
import ar.org.cdsfuturo.examen.entity.Notificaciones
import ar.org.cdsfuturo.examen.holder.HolderNotificaciones
import com.google.android.material.navigation.NavigationView

class ListaNotifAdapter(
    private var notifList: MutableList<Notificaciones>,
    val onItemClick: (Int) -> Boolean,
) : RecyclerView.Adapter<HolderNotificaciones>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HolderNotificaciones {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_notif, parent, false)
        return (HolderNotificaciones(view))
    }

    override fun onBindViewHolder(holder: HolderNotificaciones, position: Int) {
        holder.setData(
            notifList[position].texto,
            notifList[position].tiempo
        )
        holder.getCardLayout().setOnClickListener {
            onItemClick(position)
        }
    }

    override fun getItemCount(): Int {
        return notifList.size
    }

    fun setData(newData: ArrayList<Notificaciones>) {
        this.notifList = newData
        this.notifyDataSetChanged()
    }
}