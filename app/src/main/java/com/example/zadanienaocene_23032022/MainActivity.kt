package com.example.zadanienaocene_23032022

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


            val zablokujdane = findViewById<Button>(R.id.btnZab)
            val odblokujdane = findViewById<Button>(R.id.btnOdb)
            val PlecM = findViewById<RadioButton>(R.id.Pm)
            val PlecK = findViewById<RadioButton>(R.id.Pk)
            val Muzyka = findViewById<CheckBox>(R.id.checkMuzyka)
            val Sport = findViewById<CheckBox>(R.id.checkSport)
            val turystyka = findViewById<CheckBox>(R.id.checkTurystyka)
            val gry = findViewById<CheckBox>(R.id.checkGry)
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

        findViewById<Button>(R.id.btnWyswietl).setOnClickListener {
            var plec = " "
            var zainteresowania = " "
            
            if (PlecM.isChecked){
                plec += "Mężczyzna"
            }
            if (PlecK.isChecked){
                plec += "Kobieta"
            }
            if (Sport.isChecked){
                zainteresowania += "Sport "
            }
            if (Muzyka.isChecked){
                zainteresowania += "Muzyka "
            }
            if (turystyka.isChecked){
                zainteresowania += "turystyka "
            }
            if (gry.isChecked){
                zainteresowania += "gry "
            }
            var wynik = "\n Twoja płeć to : " + plec + "\n Twoj wiek to : " + wiek.text.toString() + " lat " + "\n Twoje zainteresowania to : " + zainteresowania
            Toast.makeText(applicationContext, "Twoje dane to : \n" + wynik, Toast.LENGTH_SHORT).show()
        }
    }
}