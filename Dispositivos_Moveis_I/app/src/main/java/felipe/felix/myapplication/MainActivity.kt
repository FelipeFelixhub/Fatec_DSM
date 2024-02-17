package felipe.felix.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var  editPeso:EditText
    lateinit var editAltura:EditText
    lateinit var btCalcular:Button
    lateinit var txtIMC:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editPeso = findViewById(R.id.editPeso)
        editAltura = findViewById(R.id.editAltura)
        btCalcular = findViewById(R.id.btCalcular)
        txtIMC = findViewById(R.id.txtIMC)

        btCalcular.setOnClickListener {
            var altura:Double = editAltura.text.toString().toDouble()
            var peso:Double = editPeso.text.toString().toDouble()
            var imc:Double = peso/(altura*altura)
            txtIMC.text = imc.toString()

        }


    }
}