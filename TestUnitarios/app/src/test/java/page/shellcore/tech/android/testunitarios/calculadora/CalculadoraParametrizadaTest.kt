package page.shellcore.tech.android.testunitarios.calculadora

import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import java.lang.Exception

@RunWith(value = Parameterized::class)
class CalculadoraParametrizadaTest(a: Int, b: Int, c: Int) {

    private var numero1 = a
    private var numero2 = b
    private var resultadoEsperado = c
    private var calculadora: Calculadora? = null

    companion object {
        /**
         * Ejemplo en nuestra división. Se requieren realizar las siguientes pruebas:
         *
         * Positivo / Positivo = Positivo
         * Positivo / Negativo = Negativo
         * Negativo / Positivo = Negativo
         * Negativo / Negativo = Positivo
         * Positivo / 0 = Excepción
         *
         * Método a probar         | Entrada         | Esperado
         * dividir(a: Int, b: Int) | a =  6, b =  2  |  3
         * dividir(a: Int, b: Int) | a =  6, b = -2  | -3
         * dividir(a: Int, b: Int) | a = -6, b =  2  | -3
         * dividir(a: Int, b: Int) | a = -6, b = -2  |  3
         * dividir(a: Int, b: Int) | a =  6, b =  0  |  Excepción
         */


        @Parameterized.Parameters @JvmStatic
        fun obtenerDatosPruebaTest(): ArrayList<Array<Any>> {
            val list: ArrayList<Array<Any>> = arrayListOf()
            list.add(arrayOf(6, 2, 3))
            list.add(arrayOf(6, -2, -3))
            list.add(arrayOf(-6, 2, -3))
            list.add(arrayOf(-6, -2, 3))
            list.add(arrayOf(6, 0, 0))
            return list
        }
    }

    @Before
    fun setup() {
        calculadora = Calculadora()
    }

    @Test
    fun dividirTest() {
        Assert.assertEquals(resultadoEsperado, calculadora?.dividir(numero1, numero2))
    }

}