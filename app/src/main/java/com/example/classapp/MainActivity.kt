package com.example.classapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

val secondActbutton= findViewById<Button>(R.id.button)
secondActbutton.setOnClickListener{
    val Intent = Intent(this,SecondActivity::class.java)
    startActivity(Intent)
}    }
}