package com.example.recyclerviewlistagem

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class Adapter(var modelos: List<String>, var colors: List<String>): RecyclerView.Adapter<ItemViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return ItemViewHolder(view)
    }

    override fun getItemCount(): Int {
        return modelos.size
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val nomeDaVersao = modelos[position]
        val color = colors[position]
        holder.configItem(nomeDaVersao, position, color)
    }
}