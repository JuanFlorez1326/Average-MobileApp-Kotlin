package com.juandev.average

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ActivityEstadisticas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_estadisticas)

        Estatisticas()
    }

    private fun Estatisticas(){
        var btnEstadisticas: Button = findViewById(R.id.btnVolverEstadisticas)
        btnEstadisticas.setOnClickListener{ OnClick(1) }
    }
    private fun OnClick(button:Int){
        when(button){
            1 -> { startActivity(Intent(this,ActivityRegistro::class.java)) }
        }
    }
}