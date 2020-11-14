package com.example.chessopeningsstories

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this,"Welcome", Toast.LENGTH_SHORT).show()

        var buttonOpen = findViewById<Button>(R.id.buttonOpening)
        buttonOpen.setBackgroundColor(Color.WHITE)
    }
}