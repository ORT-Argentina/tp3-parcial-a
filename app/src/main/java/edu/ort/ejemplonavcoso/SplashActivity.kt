package edu.ort.ejemplonavcoso

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SplashActivity : AppCompatActivity() {

    private lateinit var splashButton : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
    }
    override fun onStart(){
        super.onStart()
        splashButton = findViewById(R.id.splash_button)
        val intention = Intent(this, LoginActivity::class.java)
        splashButton.setOnClickListener {
            startActivity(intention)
        }
    }
}