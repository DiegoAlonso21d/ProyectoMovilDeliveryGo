package com.practicas.proyectomovildeliverygo.activities.ui.favoritos

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.practicas.proyectomovildeliverygo.R
import com.practicas.proyectomovildeliverygo.databinding.FragmentFavoritosBinding
import com.practicas.proyectomovildeliverygo.databinding.FragmentPedidoosBinding

class FavoritossFragment : Fragment() {

    private var _binding: FragmentFavoritosBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_favoritos, container, false);
    }
}