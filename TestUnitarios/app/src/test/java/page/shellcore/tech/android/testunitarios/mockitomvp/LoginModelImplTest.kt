package page.shellcore.tech.android.testunitarios.mockitomvp

import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.verify
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class LoginModelImplTest {

    @Mock
    private lateinit var presenter: Login.Presenter

    private lateinit var model: Login.Model

    @Before
    @Throws(Exception::class)
    fun setup() {
        model = LoginModelImpl(presenter)
    }

    @Test
    @Throws(Exception::class)
    fun shouldSuccessWithValidUserAndPasswordTest() {
        model.validaUser("alberto", "1234")
        verify(presenter).usuarioValido()
    }

    @Test
    @Throws(Exception::class)
    fun shouldErrorWithInvalidUserAndPasswordTest() {
        model.validaUser("maria", "4567")
        verify(presenter).error()
    }
}