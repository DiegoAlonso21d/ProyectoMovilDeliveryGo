package com.practicas.proyectomovildeliverygo.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.practicas.proyectomovildeliverygo.databinding.ActivityMenuBinding
import com.practicas.proyectomovildeliverygo.databinding.ActivityPerfilUsuarioBinding

class Activity_Perfil_Usuario : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var binding : ActivityPerfilUsuarioBinding

        super.onCreate(savedInstanceState)
        binding = ActivityPerfilUsuarioBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}