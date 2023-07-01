package com.practicas.proyectomovildeliverygo.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.practicas.proyectomovildeliverygo.R
import com.practicas.proyectomovildeliverygo.databinding.ActivityMainBinding
import com.practicas.proyectomovildeliverygo.databinding.ActivityMenuBinding
import com.practicas.proyectomovildeliverygo.databinding.ActivityRegistroAppBinding

class Activity_menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var binding : ActivityMenuBinding

        super.onCreate(savedInstanceState)
        binding = ActivityMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.restaurantes.setOnClickListener {
            startActivity(Intent(this, ListadoRestaurantes::class.java))
        }
        binding.bebidas.setOnClickListener {
            startActivity(Intent(this, Listadobebibas::class.java))
        }
        binding.farmacias.setOnClickListener {
            startActivity(Intent(this, Listadofarmacias::class.java))
        }
        binding.tiendas.setOnClickListener {
            startActivity(Intent(this, Listadotiendas::class.java))
        }
        binding.imgperfil.setOnClickListener {
            startActivity(Intent(this, Activity_Perfil_Usuario::class.java))
        }
        binding.imgCarrito.setOnClickListener {
            startActivity(Intent(this, Activity_Mis_Pedidos::class.java))
        }
    }
}