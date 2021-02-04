package com.example.soccerquiz

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth

class AuthenticationActivity : AppCompatActivity() {
    private lateinit var inputEmail: EditText
    private lateinit var inputpassword: EditText
    private lateinit var Forgotpassword: TextView
    private lateinit var Login: Button
    private lateinit var donthaveacount: TextView
    private lateinit var register: TextView

    private lateinit var mAuth: FirebaseAuth


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mAuth = FirebaseAuth.getInstance()

        if (mAuth.currentUser != null)
        {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }

        setContentView(R.layout.activity_authentication)

        inputEmail = findViewById(R.id.editTextEmailAddress)
        inputpassword = findViewById(R.id.editTextPassword)
        Forgotpassword = findViewById(R.id.editTextForgotpassword)
        Login = findViewById(R.id.Loginbutton)
        donthaveacount = findViewById(R.id.DonthaveacountView)
        register = findViewById(R.id.RegisterView)

        register.setOnClickListener{
            startActivity(Intent(this, RegisterActivity::class.java))
        }

        Forgotpassword.setOnClickListener{
            startActivity(Intent(this, ForgotPassActivity::class.java))
        }

        Login.setOnClickListener {

            val email = inputEmail.text.toString()
            val password = inputpassword.text.toString()
            if (email.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "ერთერთი ველი ცარიელია!", Toast.LENGTH_SHORT).show()
            } else {
                mAuth.signInWithEmailAndPassword(email, password)
                        .addOnCompleteListener { task ->
                            if (task.isSuccessful) {
                                startActivity(Intent(this, MainActivity::class.java))
                                finish()
                            } else {
                                Toast.makeText(this, "შეცდომა!", Toast.LENGTH_LONG).show()
                            }
                        }
            }
        }

    }


}



