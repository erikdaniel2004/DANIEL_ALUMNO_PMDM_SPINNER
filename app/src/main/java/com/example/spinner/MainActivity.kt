package com.example.spinner

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.GridView
import android.widget.ListView
import android.widget.Spinner
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.spinner.data.DataAdapter
import com.example.spinner.data.ItemViewModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Creamos el dataset
        val data = ArrayList<ItemViewModel>()
        for (i in 1..20) {
            val image = android.R.drawable.arrow_up_float
            val descripcion = "Descripción elemento $i"
            data.add(ItemViewModel( image, descripcion))
        }

        // Creamos el adaptador
        val adapter = DataAdapter(data)
    }
}