package com.example.soccerquiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Barcelonaimages : AppCompatActivity() {
    private lateinit var Image : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.barcelona_images)

        Image = findViewById(R.id.image)
    }
}