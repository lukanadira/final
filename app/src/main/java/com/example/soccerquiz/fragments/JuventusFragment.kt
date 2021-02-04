package com.example.soccerquiz.fragments

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.soccerquiz.JuventusrecyclerActivity
import com.example.soccerquiz.R

class JuventusFragment : Fragment(R.layout.fragment_juventus) {

    private lateinit var clubhistory : Button
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        clubhistory = view.findViewById(R.id.ClubHistory2)


        clubhistory.setOnClickListener{
            startActivity(Intent(context,JuventusrecyclerActivity::class.java))
        }
    }
}