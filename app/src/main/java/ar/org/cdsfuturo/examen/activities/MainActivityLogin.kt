package ar.org.cdsfuturo.examen.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.content.ContextCompat.startActivity
import ar.org.cdsfuturo.examen.R

class MainActivityLogin : AppCompatActivity() {

    lateinit var submit: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_login)
    }

    override fun onStart() {
        super.onStart()
        submit = findViewById(R.id.btn_ingresar)

        submit.setOnClickListener {
            val intent = Intent(this, MainActivityHome::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
            intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY)
            startActivity(intent)
            finish()
        }
    }
}