package com.juandev.average

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class ActivityRegistro : AppCompatActivity() {

    var txtDocumento:EditText = findViewById(R.id.iptDocumento)
    var txtNombre:EditText = findViewById(R.id.iptNombre)
    var txtEdad:EditText = findViewById(R.id.iptEdad)
    var txtTelefono:EditText = findViewById(R.id.iptTelefono)
    var txtDireccion:EditText = findViewById(R.id.iptDireccion)

    var txtMateria1:EditText = findViewById(R.id.txtMateria1)
    var txtMateria2:EditText = findViewById(R.id.txtMateria2)
    var txtMateria3:EditText = findViewById(R.id.txtMateria3)
    var txtMateria4:EditText = findViewById(R.id.txtMateria4)
    var txtMateria5:EditText = findViewById(R.id.txtMateria5)

    var iptNota1:EditText = findViewById(R.id.iptNota1)
    var iptNota2:EditText = findViewById(R.id.iptNota2)
    var iptNota3:EditText = findViewById(R.id.iptNota3)
    var iptNota4:EditText = findViewById(R.id.iptNota4)
    var iptNota5:EditText = findViewById(R.id.iptNota5)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)

        val btnEnviar:Button = findViewById(R.id.btnEnviarDatos)
        btnEnviar.setOnClickListener { OnClick(1) }
    }

    private fun OnClick(button:Int){
        when(button){
            1 -> {

                var documento:String = txtDocumento.text.toString()
                var nombre:String = txtNombre.text.toString()
                var edad:String = txtEdad.text.toString()
                var telefono:String = txtTelefono.text.toString()
                var direccion:String = txtDireccion.text.toString()

                var materia1:String = txtMateria1.text.toString()
                var materia2:String = txtMateria2.text.toString()
                var materia3:String = txtMateria3.text.toString()
                var materia4:String = txtMateria4.text.toString()
                var materia5:String = txtMateria5.text.toString()

                var n1:String = iptNota1.text.toString()
                var n2:String = iptNota2.text.toString()
                var n3:String = iptNota3.text.toString()
                var n4:String = iptNota4.text.toString()
                var n5:String = iptNota5.text.toString()


                var promedio:Float = (n1.toFloat() + n2.toFloat() + n3.toFloat() + n4.toFloat() + n5.toFloat())/5

                val btnVerDatos = Intent(this,ActivityVerDatos::class.java)
                val miBundle:Bundle = Bundle()

                miBundle.putString("documento",documento)
                miBundle.putString("nombre",nombre)
                miBundle.putString("edad",edad)
                miBundle.putString("telefono",telefono)
                miBundle.putString("direccion",direccion)

                miBundle.putString("materia1",materia1)
                miBundle.putString("materia2",materia2)
                miBundle.putString("materia3",materia3)
                miBundle.putString("materia4",materia4)
                miBundle.putString("materia4",materia5)

                miBundle.putString("promedio",promedio.toString())

                btnVerDatos.putExtras(miBundle)
                startActivity(btnVerDatos)
            }
        }
    }
}