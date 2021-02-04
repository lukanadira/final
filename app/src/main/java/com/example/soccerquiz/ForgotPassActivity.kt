package com.example.soccerquiz

import android.content.Intent
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.google.firebase.auth.FirebaseAuth

class ForgotPassActivity : AppCompatActivity() {

    private lateinit var emailEditText: EditText
    private lateinit var sendButton: Button

    private lateinit var mAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgotpass)

        mAuth = FirebaseAuth.getInstance()

        emailEditText = findViewById(R.id.resetEmailEditText)
        sendButton = findViewById(R.id.resetButton)

        sendButton.setOnClickListener {
            val email = emailEditText.text.toString()
            if (email.isEmpty()) {
                Toast.makeText(this, "Empty!", Toast.LENGTH_SHORT).show()
            } else {
                mAuth.sendPasswordResetEmail(email).addOnCompleteListener {
                        task ->
                    if (task.isSuccessful) {
                        startActivity(Intent(this, AuthenticationActivity::class.java))
                        finish()
                    } else {
                        Toast.makeText(this, "Error!", Toast.LENGTH_SHORT).show()
                    }
                }
            }

        }
    }

}

