package com.example.recyclerviewlistagem

import android.graphics.Color
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView

class ItemViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    private var tvItemVersionName: TextView
    private var clContainer: ConstraintLayout

    init {
        tvItemVersionName = itemView.findViewById(R.id.tv_item_version_name)
        clContainer = itemView.findViewById(R.id.cl_conteiner)
    }

    fun configItem(nomeDaVersao: String, position: Int, pColor: String) {
        tvItemVersionName.text = nomeDaVersao
        val color =  Color.parseColor(pColor)
        clContainer.setBackgroundColor(color)

        clContainer.setOnClickListener() {
            Toast.makeText(itemView.context, "Você clicou em $nomeDaVersao na posição $position", Toast.LENGTH_LONG).show()
        }
    }
}