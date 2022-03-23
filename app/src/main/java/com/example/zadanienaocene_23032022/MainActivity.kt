package com.example.zadanienaocene_23032022

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


            val zablokujdane = findViewById<Button>(R.id.btnZab)
            val odblokujdane = findViewById<Button>(R.id.btnOdb)
            var PlecM = findViewById<RadioButton>(R.id.Pm)


        zablokujdane.setOnClickListener {

        }
    }
}