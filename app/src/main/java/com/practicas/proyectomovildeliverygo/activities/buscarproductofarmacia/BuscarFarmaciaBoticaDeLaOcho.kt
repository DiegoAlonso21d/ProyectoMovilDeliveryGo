package com.practicas.proyectomovildeliverygo.activities.buscarproductofarmacia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.practicas.proyectomovildeliverygo.R
import com.practicas.proyectomovildeliverygo.adapters.BoticaOchoAdapter
import com.practicas.proyectomovildeliverygo.databinding.ActivityBuscarFarmaciaBoticaDeLaOchoBinding
import com.practicas.proyectomovildeliverygo.models.BoticaOcho

class BuscarFarmaciaBoticaDeLaOcho : AppCompatActivity() {

    private var boticaOchoAdapter = BoticaOchoAdapter()
    private lateinit var binding: ActivityBuscarFarmaciaBoticaDeLaOchoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBuscarFarmaciaBoticaDeLaOchoBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvboticadelasocho.adapter = boticaOchoAdapter

        boticaOchoAdapter.updateList(getBoticaOcho)
    }

    private fun  generarBoticaOcho() : ArrayList<BoticaOcho> {
        var lista = ArrayList<BoticaOcho>()
        lista.add(BoticaOcho(R.drawable.medicina0_1, "Medicina Genfar","Amoxicilina Genfar","s/.25.0"))
        lista.add(BoticaOcho(R.drawable.medicina0_2, "Plamodex","Plamodex de 16 unidades","s/.4.0"))
        lista.add(BoticaOcho(R.drawable.medicina0_3, "Doxipet","Antibioticos(uso para mascotas)","s/.15.0"))
        lista.add(BoticaOcho(R.drawable.medicina0_4, "Ibuprofeno Cinfa 600mg","ibuprofeno Cinfa 600mg","s/.7.86"))
        return lista
    }



}