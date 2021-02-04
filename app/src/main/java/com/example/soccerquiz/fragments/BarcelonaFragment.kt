package com.example.soccerquiz.fragments

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.soccerquiz.*

class BarcelonaFragment : Fragment(R.layout.fragment_barcelona) {

    private lateinit var ClubHistory : Button
    private lateinit var ClubQuiz : Button


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        ClubHistory = view.findViewById(R.id.barcelonaclubhistory)
        ClubQuiz = view.findViewById(R.id.barcelonaquiz)

        ClubHistory.setOnClickListener {
            startActivity(Intent(context,BarcelonarecyclerActivity::class.java))
        }

        ClubQuiz.setOnClickListener{
            startActivity(Intent(context,QuizQuestionsActivity::class.java))
        }

    }
}