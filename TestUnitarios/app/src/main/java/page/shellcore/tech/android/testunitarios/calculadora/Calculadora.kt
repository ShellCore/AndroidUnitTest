package page.shellcore.tech.android.testunitarios.calculadora

import java.lang.ArithmeticException
import java.lang.Exception

class Calculadora {

    private var resultado: Int = 0

    fun sumar(num1: Int, num2: Int): Int {
        resultado = num1 + num2
        return resultado
    }

    fun restar(num1: Int, num2: Int): Int {
        resultado = num1 - num2
        return resultado
    }

    fun dividir(num1: Int, num2: Int): Int {
        resultado = num1 / num2
        return resultado
    }

    fun dividirPorCero(num1: Int, num2: Int): Int {
        if (num2 == 0) {
            throw ArithmeticException("No se puede dividir por cero")
        }
        resultado = num1 / num2
        return resultado
    }

    fun operacionLargaDuracion() {
        try {
            Thread.sleep(1000)
        } catch (e: Exception) {}
    }
}