package com.practicas.proyectomovildeliverygo.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.practicas.proyectomovildeliverygo.R
import com.practicas.proyectomovildeliverygo.databinding.ActivityDetalleProductoBinding
import com.practicas.proyectomovildeliverygo.databinding.ActivityIniciarSesionBinding

class Activity_Iniciar_Sesion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var binding : ActivityIniciarSesionBinding

        super.onCreate(savedInstanceState)
        binding = ActivityIniciarSesionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnIngresar.setOnClickListener {
            startActivity(Intent(this, Activity_Permisos_Configuracion::class.java))
        }
        binding.btnCrearCuentaLogin.setOnClickListener {
            startActivity(Intent(this, Activity_Registro_App::class.java))
        }
    }
}