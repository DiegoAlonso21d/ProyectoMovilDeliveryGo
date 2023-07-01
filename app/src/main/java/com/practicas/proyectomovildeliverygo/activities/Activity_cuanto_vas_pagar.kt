package com.practicas.proyectomovildeliverygo.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.practicas.proyectomovildeliverygo.R
import com.practicas.proyectomovildeliverygo.databinding.ActivityConfigurarPerfilBinding
import com.practicas.proyectomovildeliverygo.databinding.ActivityCuantoVasPagarBinding

class Activity_cuanto_vas_pagar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var binding : ActivityCuantoVasPagarBinding

        super.onCreate(savedInstanceState)
        binding = ActivityCuantoVasPagarBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageBAtras.setOnClickListener {
            startActivity(Intent(this, Activity_Pagar_Pedido::class.java))
        }
        binding.btnConfirmar.setOnClickListener {
            startActivity(Intent(this, Activity_Pagar_Pedido::class.java))
        }
    }
}