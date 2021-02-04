package com.example.soccerquiz.fragments

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.example.soccerquiz.AuthenticationActivity
import com.example.soccerquiz.Homeinfo
import com.example.soccerquiz.R
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.*

class HomeFragment : Fragment(R.layout.fragment_home) {
    private lateinit var logoutButton: Button
    private lateinit var saveButton: Button
    private lateinit var personNameEditText: EditText
    private lateinit var personUrl: EditText
    private lateinit var imageView: ImageView
    private lateinit var firstNameLastName: TextView

    private lateinit var mAuth: FirebaseAuth
    private lateinit var dataBase: DatabaseReference


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        mAuth = FirebaseAuth.getInstance()
        dataBase = FirebaseDatabase.getInstance().getReference("UserInfo")

        logoutButton = view.findViewById(R.id.Logoutbutton)
        saveButton = view.findViewById(R.id.Savebutton)
        personNameEditText = view.findViewById(R.id.PersonName)
        personUrl = view.findViewById(R.id.PersonUrl)
        imageView = view.findViewById(R.id.imageView)
        firstNameLastName = view.findViewById(R.id.firstandlastname)



        if (mAuth.currentUser?.uid != null){
            dataBase.child(mAuth.currentUser?.uid!!).addValueEventListener(object : ValueEventListener{
                override fun onDataChange(snapshot: DataSnapshot) {
                    val p = snapshot.getValue(Homeinfo::class.java)

                    if(p != null){
                        firstNameLastName.text = p.name
                        Glide.with(this@HomeFragment)
                            .load(p.url)
                            .centerCrop()
                            .into(imageView)

                    }
                }

                override fun onCancelled(error: DatabaseError) {
                    Toast.makeText(context, "Data base error!", Toast.LENGTH_SHORT).show()
                }


            })


        }


        saveButton.setOnClickListener {
            val personName = personNameEditText.text.toString()
            val personUrl1 = personUrl.text.toString()

            if(personName.isEmpty() || personUrl1.isEmpty()){
                Toast.makeText(context, "Please input text!!", Toast.LENGTH_SHORT).show()
            } else {
                val personInformation = Homeinfo(personName, personUrl1)

                if (mAuth.currentUser?.uid != null) {
                    dataBase.child(mAuth.currentUser?.uid!!).setValue(personInformation)
                        .addOnCompleteListener { task ->
                            if (task.isSuccessful) {
                                Toast.makeText(context, "Information added!", Toast.LENGTH_SHORT)
                                    .show()
                            } else {
                                Toast.makeText(
                                    context,
                                    "Information doesn't add!",
                                    Toast.LENGTH_SHORT
                                ).show()
                            }
                        }

                }

                if (mAuth.currentUser?.uid != null) {
                    dataBase.child(mAuth.currentUser?.uid!!)
                        .addValueEventListener(object : ValueEventListener {
                            override fun onDataChange(snapshot: DataSnapshot) {
                                val p = snapshot.getValue(Homeinfo::class.java)

                                if (p != null) {
                                    firstNameLastName.text = p.name
                                    Glide.with(this@HomeFragment)
                                        .load(p.url)
                                        .centerCrop()
                                        .into(imageView)

                                }
                            }

                            override fun onCancelled(error: DatabaseError) {
                                Toast.makeText(context, "Data base error!", Toast.LENGTH_SHORT)
                                    .show()
                            }

                        })

                }

            }

        }

        logoutButton.setOnClickListener {
            startActivity(Intent(getContext(), AuthenticationActivity::class.java ))
            getActivity()?.finish()
            mAuth.signOut()
        }

    }




}