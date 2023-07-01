package com.practicas.proyectomovildeliverygo.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.practicas.proyectomovildeliverygo.R
import com.practicas.proyectomovildeliverygo.databinding.ActivityIniciarSesionBinding
import com.practicas.proyectomovildeliverygo.databinding.ActivityPedidoExitosoBinding

class Activity_Pedido_Exitoso : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var binding : ActivityPedidoExitosoBinding

        super.onCreate(savedInstanceState)
        binding = ActivityPedidoExitosoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnRegresar.setOnClickListener {
            startActivity(Intent(this, Activity_Menu_Lateral::class.java))
        }
    }
}