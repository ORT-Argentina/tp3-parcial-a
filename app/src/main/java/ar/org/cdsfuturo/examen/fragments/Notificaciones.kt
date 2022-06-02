package ar.org.cdsfuturo.examen.fragments

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ar.org.cdsfuturo.examen.R

class Notificaciones : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.notificaciones, container, false)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
    }
}