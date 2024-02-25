package com.example.practico1moviles.ui.gallery

import android.annotation.SuppressLint
import android.graphics.Typeface
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.practico1moviles.R
import com.example.practico1moviles.databinding.FragmentGalleryBinding

class GalleryFragment : Fragment() {

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.fragment_gallery, container, false)

        val editTextNombre = view.findViewById<EditText>(R.id.editTextNombre)
        val editTextSalario = view.findViewById<EditText>(R.id.editTextSalario)
        val resultado = view.findViewById<TextView>(R.id.textView1)
        val btnCalcularSalario = view.findViewById<Button>(R.id.btncalcularsalario)

        resultado.setTypeface(null, Typeface.BOLD)
        btnCalcularSalario.setOnClickListener{
            val nombre = editTextNombre.text.toString()
            val salario = editTextSalario.text.toString().toDouble()
            val iss = salario*0.03
            val afp = salario*0.04
            val renta = salario*0.05
            val salneto = salario-iss-afp-renta
            val mensaje = "El salario neto de $nombre es: $salneto"
            resultado.setText(mensaje)
            }
        return view
        }


    }


