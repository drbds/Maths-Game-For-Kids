package com.dentaliontech.mathsgameforkids

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var addition : Button
    lateinit var substraction : Button
    lateinit var muliplication : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        addition = findViewById(R.id.buttonAdd)
        substraction = findViewById(R.id.buttonSub)
        muliplication = findViewById(R.id.buttonMult)

        addition.setOnClickListener{

            val intent = Intent(this@MainActivity, MathAddition::class.java)
            (startActivity(intent))
        }
substraction.setOnClickListener{

    val intent = Intent (this@MainActivity,MathSubstaction::class.java)
    (startActivity(intent))
}
        muliplication.setOnClickListener{
            val intent = Intent (this@MainActivity,MathMultiplication::class.java)
            (startActivity(intent))
        }
    }
    }
