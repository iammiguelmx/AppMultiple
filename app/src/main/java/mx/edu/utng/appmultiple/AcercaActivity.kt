package mx.edu.utng.appmultiple

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_acerca.*
import kotlinx.android.synthetic.main.activity_ayuda.*

class AcercaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_acerca)

        btnRegresaAcerca.setOnClickListener {
            finish()
        }
    }
}
