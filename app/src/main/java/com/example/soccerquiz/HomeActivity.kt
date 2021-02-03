package com.example.soccerquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.bumptech.glide.Glide
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.UserInfo
import com.google.firebase.database.*
import java.util.*
import java.util.jar.Attributes

class HomeActivity : AppCompatActivity() {
    private lateinit var Inputname : EditText
    private lateinit var Inputurl : EditText
    private lateinit var Savebutton : Button
    private lateinit var Logoutbutton : Button
    private lateinit var ImageView : ImageView
    private lateinit var Name : TextView

    private lateinit var mAuth: FirebaseAuth
    private lateinit var db: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_home)

        mAuth = FirebaseAuth.getInstance()
        db = FirebaseDatabase.getInstance().getReference("UserInfo")

        Inputname = findViewById(R.id.PersonName)
        Inputurl = findViewById(R.id.PersonUrl)
        Savebutton = findViewById(R.id.Savebutton)
        Logoutbutton = findViewById(R.id.Logoutbutton)
        ImageView = findViewById(R.id.imageView)
        Name = findViewById(R.id.firstandlastname)


        Logoutbutton.setOnClickListener {
            mAuth.signOut()
            startActivity(Intent(this,AuthenticationActivity::class.java))
            finish()
        }

        Savebutton.setOnClickListener {

            val name = Inputname.text.toString()
            val url = Inputurl.text.toString()

            val p = Homeinfo(name,url)

            if(mAuth.currentUser?.uid != null) {
                db.child(mAuth.currentUser?.uid!!).setValue(p).addOnCompleteListener { task ->
                    if(task.isSuccessful){
                        Toast.makeText(this,"წარმატებით შესრულდა!",Toast.LENGTH_LONG).show()
                        Inputname.text = null
                        Inputurl.text = null
                    }else{
                        Toast.makeText(this,"შეცდომა!", Toast.LENGTH_LONG).show()
                    }
                }
            }
        }
        if(mAuth.currentUser?.uid != null) {
            db.child(mAuth.currentUser?.uid!!).addValueEventListener(object : ValueEventListener{

                override fun onDataChange(snapshot: DataSnapshot){

                    val p = snapshot.getValue(Homeinfo::class.java)

                    if (p != null){

                        Name.text = p.name

                        Glide.with(this@HomeActivity)
                                .load(Inputurl)
                                .centerCrop()
                                .placeholder(R.drawable.ic_launcher_background)
                                .into(ImageView)

                    }
                }

                override fun onCancelled(error: DatabaseError) {
                    Toast.makeText(this@HomeActivity, "შეცდომა!", Toast.LENGTH_LONG ).show()
                }

            })

        }
    }
}











