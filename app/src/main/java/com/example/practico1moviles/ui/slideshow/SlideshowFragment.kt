package com.example.practico1moviles.ui.slideshow

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
import com.example.practico1moviles.databinding.FragmentSlideshowBinding

class SlideshowFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
       val view = inflater.inflate(R.layout.fragment_slideshow, container, false)

        val editTextdato1 = view.findViewById<EditText>(R.id.editTextPrimerDato)
        val editTextdato2 = view.findViewById<EditText>(R.id.editTextSegundoDato)
        val textViewresult = view.findViewById<TextView>(R.id.textViewResultado)
        textViewresult.setTypeface(null, Typeface.BOLD)
        val btnsuma = view.findViewById<Button>(R.id.buttonSuma)
        btnsuma.setOnClickListener{
            val dato1 = editTextdato1.text.toString().toDouble()
            val dato2 = editTextdato2.text.toString().toDouble()
            val resultado = dato1 + dato2

            val mensaje = "El resultado de la suma es: $resultado"
            textViewresult.setText(mensaje)


        }
        val btnresta = view.findViewById<Button>(R.id.buttonResta)
        btnresta.setOnClickListener{
            val dato1 = editTextdato1.text.toString().toDouble()
            val dato2 = editTextdato2.text.toString().toDouble()
            val resultado = dato1 - dato2

            val mensaje = "El resultado de la resta es: $resultado"
            textViewresult.setText(mensaje)


        }
        val btnmulti = view.findViewById<Button>(R.id.buttonMultiplicacion)
        btnmulti.setOnClickListener{
            val dato1 = editTextdato1.text.toString().toDouble()
            val dato2 = editTextdato2.text.toString().toDouble()
            val resultado = dato1 * dato2

            val mensaje = "El resultado de la Multiplicacion es: $resultado"
            textViewresult.setText(mensaje)
        }
        val btndiv = view.findViewById<Button>(R.id.buttonDivision)
        btndiv.setOnClickListener{
            val dato1 = editTextdato1.text.toString().toDouble()
            val dato2 = editTextdato2.text.toString().toDouble()
            val resultado = dato1 / dato2

            val mensaje = "El resultado de la Division es: $resultado"
            textViewresult.setText(mensaje)


        }
        return view
    }


}