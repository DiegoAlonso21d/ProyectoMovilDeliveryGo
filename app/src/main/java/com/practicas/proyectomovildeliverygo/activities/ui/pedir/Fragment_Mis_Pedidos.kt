package com.practicas.proyectomovildeliverygo.activities.ui.pedir

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.practicas.proyectomovildeliverygo.R

class Fragment_Mis_Pedidos : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_fragment__mis__pedidos, container, false);
    }

}