package com.practicas.proyectomovildeliverygo.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.practicas.proyectomovildeliverygo.databinding.ActivityMenuBinding
import com.practicas.proyectomovildeliverygo.databinding.ActivityMisPedidosBinding

class Activity_Mis_Pedidos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var binding : ActivityMisPedidosBinding

        super.onCreate(savedInstanceState)
        binding = ActivityMisPedidosBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}