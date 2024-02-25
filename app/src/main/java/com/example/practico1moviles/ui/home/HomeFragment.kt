package com.example.practico1moviles.ui.home

import android.graphics.Typeface
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.practico1moviles.R

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val view = inflater.inflate(R.layout.fragment_home, container, false)

        val editTextNombre = view.findViewById<EditText>(R.id.editTextNombre)
        val editTextNota1 = view.findViewById<EditText>(R.id.editTextNota1)
        val editTextNota2 = view.findViewById<EditText>(R.id.editTextNota2)
        val editTextNota3 = view.findViewById<EditText>(R.id.editTextNota3)
        val editTextNota4 = view.findViewById<EditText>(R.id.editTextNota4)
        val editTextNota5 = view.findViewById<EditText>(R.id.editTextNota5)
        val textViewPromedio = view.findViewById<TextView>(R.id.textViewPromedio)
           textViewPromedio.setTypeface(null, Typeface.BOLD)
        // Encuentra los EditText para las otras notas

        val buttonCalcularPromedio = view.findViewById<Button>(R.id.buttonCalcularPromedio)
        buttonCalcularPromedio.setOnClickListener {
            val nombre = editTextNombre.text.toString()
            val nota1 = editTextNota1.text.toString().toDouble()
            val nota2 = editTextNota2.text.toString().toDouble()
            val nota3 = editTextNota3.text.toString().toDouble()
            val nota4 = editTextNota4.text.toString().toDouble()
            val nota5 = editTextNota5.text.toString().toDouble()


            val promedio = ((nota1 + nota2 + nota3 + nota4 + nota5) / 5).toDouble()


            val estado = if (promedio >= 6) "Aprobado" else "Reprobado"

            val mensaje = "Alumno: $nombre Promedio: $promedio  - $estado"
            textViewPromedio.setText(mensaje)
        }

        return view
    }
}
