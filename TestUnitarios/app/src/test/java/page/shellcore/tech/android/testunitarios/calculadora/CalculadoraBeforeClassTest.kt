package page.shellcore.tech.android.testunitarios.calculadora

import org.junit.*
import java.lang.AssertionError

class CalculadoraBeforeClassTest {

    companion object {
        init {
            // Cosas que deben ser inicializadas antes de los objetos del Companion object
        }

        private var calculadoraBefore: Calculadora? = null
        private var calculadoraBeforeClass: Calculadora? = null

        private var numeroBefore: Int? = null
        private var numeroBeforeClass: Int? = null

        @BeforeClass @JvmStatic
        fun beforeClass() {
            calculadoraBeforeClass = Calculadora()
            numeroBeforeClass = 3
            println("Se ha realizado el beforeClass")
        }

        @AfterClass @JvmStatic
        fun afterClass() {
            calculadoraBeforeClass = null
            numeroBeforeClass = 0
            println("Se ha realizado el afterClass")
        }
    }

    @Before
    fun before() {
        calculadoraBefore = Calculadora()
        numeroBefore = 5
        println("Se ha realizado el before")
    }

    @After
    fun after() {
        calculadoraBefore = Calculadora()
        numeroBefore = 5
        println("Se ha realizado el after")
    }

    @Test
    fun pruebaBeforeVsBeforeClass() {
        numeroBeforeClass = numeroBeforeClass!! + 3
        numeroBefore = numeroBefore!! + 3

        Assert.assertEquals("numeroBeforeClass: ", 6, numeroBeforeClass!!)
        Assert.assertEquals("numeroBefore: ", 8, numeroBefore!!)

        println("Se ha realizado pruebaBeforeVsBeforeClass")
    }

    @Test
    fun pruebaBeforeVsBeforeClassAcumulado() {
        numeroBeforeClass = numeroBeforeClass!! + 3
        numeroBefore = numeroBefore!! + 3

        Assert.assertEquals("numeroBeforeClass: ", 9, numeroBeforeClass!!)
        Assert.assertEquals("numeroBefore: ", 8, numeroBefore!!)

        println("Se ha realizado pruebaBeforeVsBeforeClassAcumulado")
    }
}