package com.example.zadanienaocene_23032022

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


            val zablokujdane = findViewById<Button>(R.id.btnZab)
            val odblokujdane = findViewById<Button>(R.id.btnOdb)
            val PlecM = findViewById<RadioButton>(R.id.Pm)
            val PlecK = findViewById<RadioButton>(R.id.Pk)
            val Muzyka = findViewById<RadioButton>(R.id.radioMuzyka)
            val Sport = findViewById<RadioButton>(R.id.radioSport)
            val turystyka = findViewById<RadioButton>(R.id.radioTurystyka)
            val gry = findViewById<RadioButton>(R.id.radioGry)
            val wiek = findViewById<EditText>(R.id.TextWiek)


        zablokujdane.setOnClickListener {
            PlecM.isEnabled = false
            PlecK.isEnabled = false
            Muzyka.isEnabled = false
            Sport.isEnabled = false
            turystyka.isEnabled = false
            gry.isEnabled = false
            wiek.isEnabled = false
        }
        odblokujdane.setOnClickListener {
            PlecM.isEnabled = true
            PlecK.isEnabled = true
            Muzyka.isEnabled = true
            Sport.isEnabled = true
            turystyka.isEnabled = true
            gry.isEnabled = true
            wiek.isEnabled = true
        }
    }
}