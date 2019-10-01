package mx.edu.utng.appmultiple

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_principal.*

class PrincipalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)

        //Se dirije a Info Activy
        btnInfor.setOnClickListener {
            startActivity(Intent(this, InfoActivity::class.java))
        }

        //Se dirije a la pantalla de ayuda
        btnAyuda.setOnClickListener {
            startActivity(Intent(this, AyudaActivity::class.java))
        }

        //Se dirije a la pantalla de Acerca
        btnAcerca.setOnClickListener {
            startActivity(Intent(this, AcercaActivity::class.java))
        }


        btnSalir.setOnClickListener {
            System.exit(0)
        }


    } //End on create

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu_simple,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val msg: String = ""
        //Switch
        when (item.itemId){
            //R.id.itmInfo-> msg= "Información seleccionada"
            //R.id.itmAcerca-> msg= "Información seleccionada"
            //R.id.itmAyuda-> msg= "Información seleccionada"
            //R.id.itmSalir-> msg=  "Good Bye!!"
        }

        Toast.makeText(this, msg, Toast.LENGTH_LONG).show()
        return super.onOptionsItemSelected(item)
    }


}
