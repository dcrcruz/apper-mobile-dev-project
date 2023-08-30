package com.example.roadside

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // go to login page
        val toLoginPageButton = findViewById<Button>(R.id.toLoginPageButton)

        toLoginPageButton.setOnClickListener {
            val toLoginPage = Intent(this, LoginPage::class.java)
            startActivity(toLoginPage)
        }

        // go to sign up page
        val toSignupPageButton = findViewById<Button>(R.id.toSignupPageButton)

        toSignupPageButton.setOnClickListener {
            val toSignupPage = Intent(this, SignupPage::class.java)
            startActivity(toSignupPage)
        }
    }
}