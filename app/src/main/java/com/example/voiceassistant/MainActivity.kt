package com.example.voiceassistant

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    val tag : String = "MainActivity"



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var age : Int = 43
        var height : Double = 163.0
        val name : String = "Galina"
        val surname : String = "Magazinova"

       val summary : String = "my name: " + name + " surname: " + surname + " " + age + " years " + height + " cm !"

        val output : TextView = findViewById(R.id.output)
        output.text = summary

        Log.d(tag, summary)
    }
}