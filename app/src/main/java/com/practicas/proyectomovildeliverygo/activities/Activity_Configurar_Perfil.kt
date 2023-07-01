package com.practicas.proyectomovildeliverygo.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.practicas.proyectomovildeliverygo.R
import com.practicas.proyectomovildeliverygo.databinding.ActivityCambiarInformacionPersonalBinding
import com.practicas.proyectomovildeliverygo.databinding.ActivityConfigurarPerfilBinding

class Activity_Configurar_Perfil : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var binding : ActivityConfigurarPerfilBinding

        super.onCreate(savedInstanceState)
        binding = ActivityConfigurarPerfilBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnInformacionPersonal.setOnClickListener {
            startActivity(Intent(this, Activity_Cambiar_informacion_personal::class.java))
        }
    }
}