package com.practicas.proyectomovildeliverygo.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.practicas.proyectomovildeliverygo.models.BoticaOcho
import androidx.recyclerview.widget.RecyclerView

import com.practicas.proyectomovildeliverygo.R.layout.boticadelaocho_bar


class BoticaOchoAdapter(private var lista: ArrayList<BoticaOcho>, private var contexto: Context): RecyclerView.Adapter<BoticaOchoAdapter.ViewHolder>(){



    class ViewHolder(var vista: View, Context: Context) : RecyclerView.ViewHolder(vista) {
        fun bind(BoticaOcho: BoticaOcho) {
           vista.imgibuprofeno
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       return ViewHolder(LayoutInflater.from(parent.context).inflate(boticadelaocho_bar, parent, false), contexto)
    }

    override fun getItemCount(): Int {
       return lista.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(lista[position])
    }
}