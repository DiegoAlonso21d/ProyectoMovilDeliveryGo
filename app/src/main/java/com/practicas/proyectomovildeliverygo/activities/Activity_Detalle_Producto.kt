package com.practicas.proyectomovildeliverygo.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.practicas.proyectomovildeliverygo.R
import com.practicas.proyectomovildeliverygo.databinding.ActivityCuantoVasPagarBinding
import com.practicas.proyectomovildeliverygo.databinding.ActivityDetalleProductoBinding

class Activity_Detalle_Producto : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var binding : ActivityDetalleProductoBinding

        super.onCreate(savedInstanceState)
        binding = ActivityDetalleProductoBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}