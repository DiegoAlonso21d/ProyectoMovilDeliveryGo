package com.practicas.proyectomovildeliverygo.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.practicas.proyectomovildeliverygo.R
import com.practicas.proyectomovildeliverygo.databinding.ActivityIngresarAppBinding
import com.practicas.proyectomovildeliverygo.databinding.ActivityMainBinding

class Activity_Ingresar_App : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        lateinit var binding : ActivityIngresarAppBinding

        super.onCreate(savedInstanceState)
        binding = ActivityIngresarAppBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSesionCuenta.setOnClickListener {
            startActivity(Intent(this, Activity_Iniciar_Sesion::class.java))
        }

        binding.btnCrearCuenta.setOnClickListener {
            startActivity(Intent(this, Activity_Registro_App::class.java))
        }
    }
}