package com.juandev.average

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ActivityVerDatos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ver_datos)

        var cNombre = findViewById<TextView>(R.id.txtNombre)
        var cMateria1 = findViewById<TextView>(R.id.txtMateria1)
        var cMateria2 = findViewById<TextView>(R.id.txtMateria2)
        var cMateria3 = findViewById<TextView>(R.id.txtMateria3)
        var cMateria4 = findViewById<TextView>(R.id.txtMateria4)
        var cMateria5 = findViewById<TextView>(R.id.txtMateria5)

        var miNombre:Bundle? = this.intent.extras
        var miMateria1:Bundle? = this.intent.extras
        var miMateria2:Bundle? = this.intent.extras
        var miMateria3:Bundle? = this.intent.extras
        var miMateria4:Bundle? = this.intent.extras
        var miMateria5:Bundle? = this.intent.extras
        var miBundle:Bundle? = this.intent.extras

        if(miBundle != null && miNombre != null && miMateria1 != null && miMateria2 != null && miMateria3 != null && miMateria4 != null && miMateria5 != null){
            cNombre.text = "${miBundle.getString("nombre")}"
            cMateria1.text = "${miBundle.getString("materia1")}"
            cMateria2.text = "${miBundle.getString("materia2")}"
            cMateria3.text = "${miBundle.getString("materia3")}"
            cMateria4.text = "${miBundle.getString("materia4")}"
            cMateria5.text = "${miBundle.getString("materia5")}"
        }
        btnVolver()
    }

    private fun btnVolver(){
        val btnVolver:Button = findViewById(R.id.btnVolver)
        btnVolver.setOnClickListener { OnClickSalir(1) }
    }
    private fun OnClickSalir(button:Int) {
        when(button){
            1 -> { startActivity(Intent(this,ActivityRegistro::class.java)) }
        }
    }
}