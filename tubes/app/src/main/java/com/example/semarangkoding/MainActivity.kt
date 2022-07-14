package com.example.semarangkoding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var auth : FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initFirebaseAuth()

        val btnPindahArtikel: Button = findViewById(R.id.btn_PindahArtikel)
        btnPindahArtikel.setOnClickListener(this)

        val btnPindahGejala: Button = findViewById(R.id.btn_PindahGejala)
        btnPindahGejala.setOnClickListener(this)

        val btnPindahRS: Button = findViewById(R.id.btn_PindahRS)
        btnPindahRS.setOnClickListener(this)

        val ViewAbout: ImageView = findViewById(R.id.View_About)
        ViewAbout.setOnClickListener(this)

        btnLogout.setOnClickListener {
            auth.signOut()
            startActivity(Intent(this, AuthActivity::class.java))
        }
    }

    override fun onClick(v: View) {
        when(v.id) {
            R.id.btn_PindahArtikel -> {
                val PindahArtikel = Intent(this, ArtikelActivity::class.java)
                startActivity(PindahArtikel)
            }

            R.id.btn_PindahGejala-> {
                val PindahGejala = Intent(this, GejalaActivity::class.java)
                startActivity(PindahGejala)
            }

            R.id.btn_PindahRS-> {
                val PindahRS = Intent(this, RSActivity::class.java)
                startActivity(PindahRS)
            }

            R.id.View_About-> {
                val PindahAbout = Intent(this, AboutActivity::class.java)
                startActivity(PindahAbout)
            }


        }
    }

    private fun initFirebaseAuth() {
        auth = FirebaseAuth.getInstance()
    }

}