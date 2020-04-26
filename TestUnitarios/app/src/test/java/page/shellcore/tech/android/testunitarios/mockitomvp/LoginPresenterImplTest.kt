package page.shellcore.tech.android.testunitarios.mockitomvp

import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.*
import org.mockito.Spy
import org.mockito.junit.MockitoJUnitRunner
import java.lang.RuntimeException

@RunWith(MockitoJUnitRunner::class)
class LoginPresenterImplTest {

    // 1. Nos permite hacer un mock de clases o interfaces.
    @Mock
    private lateinit var view: Login.View

    @Mock
    private lateinit var model: Login.Model

    private lateinit var presenter: Login.Presenter

    @Before
    fun setup() {
        presenter = LoginPresenterImpl(view)
    }

    @Test
    @Throws(Exception::class)
    fun shouldShowErrorMessageWhenUserOrPasswordIsWrongTest() {
        // 2. Nos permite programar un comportamiento
        `when`(view.getUserName()).thenReturn("maria")
        `when`(view.getPassword()).thenReturn("5678")

        // 3. Ejecutamos un método
        presenter.validateUser(view.getUserName(), view.getPassword())

        // 4. Verificar que la vista ejecuta el método view.error()
        verify(view).error()
    }

    @Test
    fun shouldCallUsuarioValidoWhenUserAndPasswordAreRightTest() {
        `when`(view.getUserName()).thenReturn("alberto")
        `when`(view.getPassword()).thenReturn("1234")

        Assert.assertEquals("alberto", view.getUserName())
        Assert.assertEquals("1234", view.getPassword())

        presenter.validateUser(view.getUserName(), view.getPassword())
        verify(view).usuarioValido()
    }

    @Test
    @Throws(Exception::class)
    fun shouldThrowException() {
        `when`(view.getUserName()).thenThrow(RuntimeException::class.java)
        try {
            view.getUserName()
        } catch (e: Exception) {
        }
    }

    @Test
    fun shouldCallUsuarioValidoWhenUserAndPasswordAreRightDoReturnTest() {
        doReturn("alberto")
            .`when`(view).getUserName()
        Assert.assertEquals("alberto", view.getUserName())
    }

    @Test
    fun shouldCallUsuarioValidoWhenUserAndPasswordAreRightTest2() {
        `when`(view.getUserName()).thenReturn("alberto")
        `when`(view.getPassword()).thenReturn("1234")

        presenter.validateUser(view.getUserName(), view.getPassword())
        verify(view).usuarioValido()

        verify(view, times(1)).usuarioValido()
        verify(view, never()).error()
        verify(view, atLeast(1)).usuarioValido()
        verify(view, atMost(2)).usuarioValido()

        // verify that it was the only invocation and
        // that there're no more unverified interactions
//        verify(view, only()).usuarioValido()
    }

    @Mock
    val mockList = arrayListOf<String>()

    @Spy
    val spyList = arrayListOf<String>()

    @Test
    @Throws(Exception::class)
    fun spyTest() {
        spyList.add("one")
        spyList.add("two")

        verify(spyList).add("one")
        verify(spyList).add("two")

        Assert.assertEquals(2, spyList.size)
    }

    @Test
    @Throws(Exception::class)
    fun mockTest() {
        mockList.add("one")
        mockList.add("two")

        verify(mockList).add("one")
        verify(mockList).add("two")

        // Falla porque el mock no está haciendo realmente la insersión a la lista.
//        Assert.assertEquals(2, mockList.size)
    }

}