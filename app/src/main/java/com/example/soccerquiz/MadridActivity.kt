package com.example.soccerquiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MadridActivity : AppCompatActivity() {

    private lateinit var ClubHistory : Button
    private lateinit var Quiz : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_realmadrid)

        ClubHistory = findViewById(R.id.ClubHistory1)
        Quiz = findViewById(R.id.Quiz1)
    }
}