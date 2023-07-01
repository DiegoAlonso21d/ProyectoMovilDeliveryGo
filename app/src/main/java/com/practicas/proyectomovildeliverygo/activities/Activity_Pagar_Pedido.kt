package com.practicas.proyectomovildeliverygo.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.practicas.proyectomovildeliverygo.R
import com.practicas.proyectomovildeliverygo.databinding.ActivityPagarPedidoBinding
import com.practicas.proyectomovildeliverygo.databinding.ActivityRegistroExitosoBinding

class Activity_Pagar_Pedido : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var binding : ActivityPagarPedidoBinding
        super.onCreate(savedInstanceState)
        binding = ActivityPagarPedidoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnmedipago.setOnClickListener {
            startActivity(Intent(this, Activity_Confirmar_Pedido::class.java))
        }
        binding.tvIngresarMonto.setOnClickListener {
            startActivity(Intent(this, Activity_cuanto_vas_pagar::class.java))
        }
        binding.tvAgregarTarjeta.setOnClickListener {
            startActivity(Intent(this, Activity_Agregar_Tarjeta::class.java))
        }
    }
}