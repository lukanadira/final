package com.example.soccerquiz.fragments

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.soccerquiz.MadridrecyclerActivity
import com.example.soccerquiz.QuizQuestionsActivity
import com.example.soccerquiz.R

class RealmadridFragment : Fragment(R.layout.fragment_realmadrid) {

    private lateinit var ClubHistory : Button
    private lateinit var ClubQuiz : Button

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        ClubHistory = view.findViewById(R.id.ClubHistory1)
        ClubQuiz = view.findViewById(R.id.Quiz1)

        ClubHistory.setOnClickListener {
            startActivity(Intent(context,MadridrecyclerActivity::class.java))
        }

        ClubQuiz.setOnClickListener{
            startActivity(Intent(context, QuizQuestionsActivity::class.java))
        }

    }

}