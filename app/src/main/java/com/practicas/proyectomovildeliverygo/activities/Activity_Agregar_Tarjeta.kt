package com.practicas.proyectomovildeliverygo.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.practicas.proyectomovildeliverygo.databinding.ActivityAgregarTarjetaBinding


class Activity_Agregar_Tarjeta : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var binding : ActivityAgregarTarjetaBinding

        super.onCreate(savedInstanceState)
        binding = ActivityAgregarTarjetaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnconfitarje.setOnClickListener {
            startActivity(Intent(this, Activity_Confirmar_Pedido::class.java))
        }
        binding.btnreversa.setOnClickListener {
            startActivity(Intent(this, Activity_Pagar_Pedido::class.java))
        }
    }
}