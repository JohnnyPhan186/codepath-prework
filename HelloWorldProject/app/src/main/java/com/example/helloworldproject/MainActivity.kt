package com.example.helloworldproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView


// User interaction

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Show the layout file: activity_main
        setContentView(R.layout.activity_main)

        // Display customized to show "Hello from {name}"
        //1. Add a button to our layout
        //Get a reference to button
        findViewById<Button>(R.id.button).setOnClickListener {
            //Handles button tap
            Log.i("Johnny","Tapped on button")
            //Get a reference to the text view
            //Set the color of the text view
            findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.white))
        }
    }
}