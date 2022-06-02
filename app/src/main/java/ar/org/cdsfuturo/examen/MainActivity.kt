package ar.org.cdsfuturo.examen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import ar.org.cdsfuturo.examen.activities.MainActivityHome
import ar.org.cdsfuturo.examen.activities.MainActivityLogin

class MainActivity : AppCompatActivity() {

    lateinit var submit: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        submit = findViewById(R.id.btn_home_ingresar)

        submit.setOnClickListener {
            val intent = Intent(this, MainActivityLogin::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
            intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY)
            startActivity(intent)
            finish()
        }
    }
}