package com.practicas.proyectomovildeliverygo.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.practicas.proyectomovildeliverygo.R
import com.practicas.proyectomovildeliverygo.databinding.ActivityRegistroExitosoBinding
import com.practicas.proyectomovildeliverygo.databinding.ActivityTusPedidosBinding

class Activity_Tus_Pedidos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var binding : ActivityTusPedidosBinding
        super.onCreate(savedInstanceState)
        binding = ActivityTusPedidosBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnIrApagar.setOnClickListener {
            startActivity(Intent(this, Activity_Pagar_Pedido::class.java))
        }
    }
}