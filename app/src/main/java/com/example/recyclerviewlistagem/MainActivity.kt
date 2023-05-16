package com.example.recyclerviewlistagem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val modelos = listOf<String>(
            "Android 4 Ice Cream Sandwich",
            "Android 4.1 Jelly Baan",
            "Android 4.4 KitKat",
            "Android 5 Lollopop",
            "Android 6 Marshmallow",
            "Android 7 Nougat",
            "Android 8 Oreo",
            "Android 9.0 Pie",
            "Android 10 Q"
        )

        val rainbow_colors = resources.getStringArray(R.array.rainbow_colors)
        val recycler = findViewById<RecyclerView>(R.id.rv_lista_de_versoes)
        recycler.adapter = Adapter(modelos, rainbow_colors.asList())
    }
}