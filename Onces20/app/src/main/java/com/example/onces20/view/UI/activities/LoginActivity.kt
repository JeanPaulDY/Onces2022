package com.example.onces20.view.UI.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.onces20.R

class LoginActivity : AppCompatActivity() {
    lateinit var iniciobutton:Button
    lateinit var registrobutton:Button
    lateinit var recuperarbutton:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        iniciobutton= findViewById(R.id.BTinicio)
        registrobutton= findViewById(R.id.BTregistro)
        recuperarbutton= findViewById(R.id.BTrecuperar)

        iniciobutton.setOnClickListener {
            startActivity(Intent(this, LoginStartActivity::class.java))
        }
        registrobutton.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }
        }
    }