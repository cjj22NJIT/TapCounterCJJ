package com.example.tapcountercjj22

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.*
import android.widget.*

var counter = 0
var tapIncrement = 1

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        val textView = findViewById<TextView>(R.id.textView)
        val upgradeButton = findViewById<Button>(R.id.upgradeBtn)

        button.setOnClickListener{
            //Toast.makeText(it.context,"Tap!", Toast.LENGTH_SHORT).show()
            counter+=tapIncrement
            textView.text = counter.toString()

            if(counter>=100){
                upgradeButton.visibility = View.VISIBLE

                upgradeButton.setOnClickListener{
                    tapIncrement++
                    counter = 0
                    textView.text = counter.toString()
                    button.text = "Add "+tapIncrement

                    upgradeButton.visibility = View.INVISIBLE
                }

            }

        }





    }
}