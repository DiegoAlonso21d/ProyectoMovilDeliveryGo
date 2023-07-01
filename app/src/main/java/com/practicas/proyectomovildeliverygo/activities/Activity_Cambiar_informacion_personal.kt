package com.practicas.proyectomovildeliverygo.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.practicas.proyectomovildeliverygo.R
import com.practicas.proyectomovildeliverygo.databinding.ActivityCambiarInformacionPersonalBinding

class Activity_Cambiar_informacion_personal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        lateinit var binding : ActivityCambiarInformacionPersonalBinding

        super.onCreate(savedInstanceState)
        binding = ActivityCambiarInformacionPersonalBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}