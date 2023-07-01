package com.practicas.proyectomovildeliverygo.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.practicas.proyectomovildeliverygo.R
import com.practicas.proyectomovildeliverygo.databinding.ActivityConfigurarPerfilBinding
import com.practicas.proyectomovildeliverygo.databinding.ActivityConfirmarPedidoBinding

class Activity_Confirmar_Pedido : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var binding : ActivityConfirmarPedidoBinding

        super.onCreate(savedInstanceState)
        binding = ActivityConfirmarPedidoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnrealizarpedido.setOnClickListener {
            startActivity(Intent(this, Activity_Pedido_Exitoso::class.java))
        }
    }
}