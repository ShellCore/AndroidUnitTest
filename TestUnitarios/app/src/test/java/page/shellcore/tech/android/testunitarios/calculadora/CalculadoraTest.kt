package page.shellcore.tech.android.testunitarios.calculadora

import org.junit.*

import org.junit.Assert.*
import java.lang.ArithmeticException

class CalculadoraTest {

    var calculadoraNull: Calculadora? = null

    var calculadora: Calculadora? = null

    @Before
    fun setup() {
        calculadora = Calculadora()
        println("Se ha instanciado el objeto Calculadora")
    }

    @After
    fun tearDown() {
        calculadora = null
        println("Se ha liberado el objeto Calculadora")
    }

    @Test
    fun calculadoraNullTest() {
        assertNull("Calculadora debe ser null", calculadoraNull)
        println("Se ha ejecutado el test calculadoraNullTest")
    }

    @Test
    fun calculadoraNotNullTest() {
        assertNotNull("Calculadora debe ser not null", calculadora)
        println("Se ha ejecutado el test calculadoraNotNullTest")
    }

    @Test
    fun sumarTestExplicado() {
        // SETUP
        val calculadoraPrueba = Calculadora()
        val resultadoEsperado = 30
        var resultadoActual: Int = 0

        resultadoActual = calculadoraPrueba.sumar(10, 20)

        // Assert
//        Assert.assertEquals(resultadoEsperado, resultadoActual)
        assertEquals(30, calculadoraPrueba.sumar(10, 20))
        println("Se ha ejecutado el test sumarTestExplicado")
    }

    @Test
    fun sumarTest() {
        assertEquals(30, calculadora?.sumar(10,20))
    }

    @Test
    fun ejemploAssert() {
        assertTrue(1 == 1)
        assertFalse(1 == 2)
//        Assert.assertNull(calculadora)
        assertNotNull(calculadora)

        val calculadora1 = Calculadora()
        val calculadora2 = Calculadora()
        val calculadora3 = calculadora1

//        Assert.assertSame(calculadora1, calculadora2)
        assertSame(calculadora1, calculadora3)
        assertNotSame(calculadora1, calculadora2)

        assertEquals("a", "a")
//        Assert.assertEquals("Esto es una prueba AssertEquals con error (a no es b)", "a", "b")

        assertEquals(1.0, 1.4, 0.5)
//        Assert.assertEquals(1.0, 1.4, 0.3)

//        Assert.fail("Fallo detectado manualmente")
    }

    @Test
    fun sumar() {
        val a = 10
        val b = 20
        val resultadoEsperado = 30
        var resultado = calculadora?.sumar(a, b)
        assertEquals(resultadoEsperado, resultado)
    }

    @Test
    fun sumar_validInput_validExpected_test() {
        assertEquals(11, calculadora?.sumar(7, 4))
        println("Se ha ejecutado el test sumar_validInput_ValidExpected_test()")
    }

    @Test
    fun restar_validInput_validExpected_test() {
        assertEquals(3, calculadora?.restar(7, 4))
        println("Se ha ejecutado el test restar_validInput_validExpected_test()")
    }

    @Test
    fun restar_validInput_validNegativeExpected_test() {
        assertEquals(-10, calculadora?.restar(10, 20))
        println("Se ha ejecutado el test restar_validInput_validNegativeExpected_test()")
    }

    @Test
    fun dividir_validInput_validExpected_test() {
        assertEquals(2, calculadora?.dividir(4, 2))
        println("Se ha ejecutado el test dividir_validInput_validExpected_test()")
    }

    @Test
    fun dividir_notValidInput_test() {
//        assertEquals(2, calculadora?.dividir(4, 0))
//        println("Se ha ejecutado el test dividir_notValidInput_test()")
        calculadora?.dividir(5,0)
        println("Se ha ejecutado el test dividir_notValidInput_test()")
        fail("Fallo detectado manualmente. No se puede dividir por cero")
    }

    @Test(expected = ArithmeticException::class)
    fun dividirPorCero_notValidInput_expectedException_test() {
        calculadora?.dividirPorCero(5,0)
        println("Se ha ejecutado el test dividirPorCero_notValidInput_expectedException_test()")
    }

    @Test(timeout = 600)
    fun operacionLargaDuracion_timeOut_test() {
        calculadora?.operacionLargaDuracion()
        println("Se ha ejecutado el test operacionLargaDuracion_timeOut_test()")
    }

    @Ignore("Falta implementación")
    @Test
    fun dividir_notValidInput_test_ignorado() {
        assertEquals(2, calculadora?.dividir(4, 0))
        println("Se ha ejecutado el test dividir_notValidInput_test_ignorado()")
    }


}