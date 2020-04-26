package page.shellcore.tech.android.testunitarios

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_pre_unit_test.*
import page.shellcore.tech.android.testunitarios.calculadora.CalculadoraPreUnitTest

class PreUnitTestActivity : AppCompatActivity() {

    private var resultado: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pre_unit_test)

        resultado = CalculadoraPreUnitTest.sumar(20, 30)

        txtResultado.text = "Resultado: $resultado"

        Log.d("TAG1", "Resultado metodo suma: $resultado")
        if (resultado == 50) {
            Log.d("TAG1", "Resultado OK: $resultado")
        } else {
            Log.d("TAG1", "Resultado NOK: $resultado")
        }
    }
}
