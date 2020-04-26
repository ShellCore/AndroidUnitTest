package page.shellcore.tech.android.testunitarios.tdd

import org.junit.Assert
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class FizzBuzzTest {

    /**
     * Historia de usuario
     *
     * Método                  | Especificación
     * of(numero: Int): String | 1. Si es divisible por 3, entonces devolver "Fizz"
     *                         | 2. Si es divisible por 5, entonces devolver "Buzz"
     *                         | 3. Si es divisible por 3 y 5, entonces devolver "FizzBuzz"
     *                         | 4. Sino entonces devolver el número
     *
     * Método a probar      | Entrada  | Salida
     * of(num: Int): String | num =  0 | 0
     *                      | num =  1 | 1
     *                      | num =  2 | 1
     *                      | num =  3 | Fizz
     *                      | num =  4 | 1
     *                      | num =  5 | Buzz
     *                      | num =  6 | Fizz
     *                      | num =  7 | 1
     *                      | num =  8 | 1
     *                      | num =  9 | Fizz
     *                      | num = 10 | Buzz
     *                      | num = 11 | 1
     *                      | num = 12 | Fizz
     *                      | num = 13 | 1
     *                      | num = 14 | 1
     *                      | num = 15 | FizBuzz
     *                      | num = 16 | 1
     */

    private lateinit var fizzBuzz: FizzBuzz

    @Before
    fun setup() {
        fizzBuzz = FizzBuzz()
    }

    @Test
    fun of_0is0() {
        Assert.assertEquals("0", fizzBuzz.of(0))
    }

    @Test
    fun of_1is1() {
        Assert.assertEquals("1", fizzBuzz.of(1))
    }

    @Test
    fun of_2is2() {
        Assert.assertEquals("2", fizzBuzz.of(2))
    }

    @Test
    fun of_3isFizz() {
        Assert.assertEquals("Fizz", fizzBuzz.of(3))
    }

    @Test
    fun of_5isBuzz() {
        Assert.assertEquals("Buzz", fizzBuzz.of(5))
    }

    @Test
    fun of_6isFizz() {
        Assert.assertEquals("Fizz", fizzBuzz.of(6))
    }

    @Test
    fun of_10isBuzz() {
        Assert.assertEquals("Buzz", fizzBuzz.of(10))
    }

    @Test
    fun of_15isFizzBuzz() {
        Assert.assertEquals("FizzBuzz", fizzBuzz.of(15))
    }

    @Test
    fun of_100isFizz() {
        Assert.assertEquals("Buzz", fizzBuzz.of(100))
    }
}