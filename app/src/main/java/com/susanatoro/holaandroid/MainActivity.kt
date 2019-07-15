package com.susanatoro.holaandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var sexo = "Masculino"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bnGuardar.setOnClickListener {
            var nombre = etNombre.text.toString()
            var correo = etCorreo.text.toString()
            var documento = etDocumento.text.toString()
            var respuesta = nombre + "\n"+ correo + "\n" +documento + "\n" + sexo
            TvResultado.text = respuesta
        }
    }

    fun onRadioButtonClicked(view: View){

        if(view is RadioButton){
            when(view.id){

                R.id.rbmasculino -> if (view.isChecked){
                    sexo = "Masculino"
                }
                R.id.rbfemenino -> if(view.isChecked){
                    sexo = "Femenino"
                }
            }

        }
    }
}


