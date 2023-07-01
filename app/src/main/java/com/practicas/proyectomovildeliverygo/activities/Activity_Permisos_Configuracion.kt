package com.practicas.proyectomovildeliverygo.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.practicas.proyectomovildeliverygo.databinding.ActivityPermisosConfiguracionBinding

class Activity_Permisos_Configuracion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var binding : ActivityPermisosConfiguracionBinding

        super.onCreate(savedInstanceState)
        binding = ActivityPermisosConfiguracionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btncontinuar.setOnClickListener {
            startActivity(Intent(this, Activity_menu::class.java))
        }
    }
}