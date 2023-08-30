package com.example.roadside

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_page)

        // login and go to main page
        val loginButton = findViewById<Button>(R.id.loginButton)

        loginButton.setOnClickListener {
            val toMainDashboard = Intent(this, MainDashboard::class.java)
            startActivity(toMainDashboard)
        }
    }
}