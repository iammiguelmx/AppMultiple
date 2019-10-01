package mx.edu.utng.appmultiple

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_ayuda.*
import kotlinx.android.synthetic.main.activity_info.*

class AyudaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ayuda)


        btnRegresaAyuda.setOnClickListener {
            finish()
        }
    }
}
