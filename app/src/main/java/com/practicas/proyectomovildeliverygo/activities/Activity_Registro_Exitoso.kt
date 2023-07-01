package com.practicas.proyectomovildeliverygo.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.practicas.proyectomovildeliverygo.R
import com.practicas.proyectomovildeliverygo.databinding.ActivityRegistroAppBinding
import com.practicas.proyectomovildeliverygo.databinding.ActivityRegistroExitosoBinding

class Activity_Registro_Exitoso : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var binding : ActivityRegistroExitosoBinding
        super.onCreate(savedInstanceState)
        binding = ActivityRegistroExitosoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnIniciarSesion.setOnClickListener {
            startActivity(Intent(this, Activity_Iniciar_Sesion::class.java))
        }
    }
}