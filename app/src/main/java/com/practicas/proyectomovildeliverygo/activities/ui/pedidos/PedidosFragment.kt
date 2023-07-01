package com.practicas.proyectomovildeliverygo.activities.ui.pedidos

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import com.practicas.proyectomovildeliverygo.R
import com.practicas.proyectomovildeliverygo.activities.Activity_Pagar_Pedido
import com.practicas.proyectomovildeliverygo.databinding.ActivityAgregarTarjetaBinding
import com.practicas.proyectomovildeliverygo.databinding.FragmentPedidoosBinding
import androidx.navigation.fragment.findNavController
import com.practicas.proyectomovildeliverygo.activities.Activity_Cambiar_informacion_personal
import com.practicas.proyectomovildeliverygo.databinding.ActivityPagarPedidoBinding
import android.content.Intent as Intent

class PedidosFragment : Fragment(R.layout.fragment_pedidoos) {

    class PedidosFragment : Fragment() {
        override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            lateinit var binding : FragmentPedidoosBinding
            val view = inflater.inflate(R.layout.fragment_pedidoos, container, false);
            binding.btnIrApagar.setOnClickListener {}

            return view
            }

    }
}