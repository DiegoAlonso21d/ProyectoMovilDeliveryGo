package com.practicas.proyectomovildeliverygo.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.practicas.proyectomovildeliverygo.R
import com.practicas.proyectomovildeliverygo.databinding.ActivityPedidoExitosoBinding
import com.practicas.proyectomovildeliverygo.databinding.ActivityRegistroAppBinding

class Activity_Registro_App : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var binding : ActivityRegistroAppBinding

        super.onCreate(savedInstanceState)
        binding = ActivityRegistroAppBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnRegistrarse.setOnClickListener {
            startActivity(Intent(this, Activity_Registro_Exitoso::class.java))
        }
        binding.btnIniciarSesionRegistro.setOnClickListener {
            startActivity(Intent(this, Activity_Iniciar_Sesion::class.java))
        }
    }
}