package edu.ort.ejemplonavcoso

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    private lateinit var loginButton : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    override fun onStart(){
        super.onStart()
        loginButton = findViewById(R.id.login_button)
        val intention = Intent(this, MainActivity::class.java)
        loginButton.setOnClickListener {
            startActivity(intention)
        }
    }
}