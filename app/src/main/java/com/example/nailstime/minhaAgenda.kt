package com.example.nailstime

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton

class minhaAgenda : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_minha_agenda)

        var buttonAgenda : AppCompatButton = findViewById(R.id.verAgenda)
        var buttonHorario : AppCompatButton = findViewById(R.id.marcarHorario)

        buttonAgenda.setOnClickListener {
            Intent intent = new Intent(this, minhaAgenda)
            startActivity(intent)
        }

    }
}