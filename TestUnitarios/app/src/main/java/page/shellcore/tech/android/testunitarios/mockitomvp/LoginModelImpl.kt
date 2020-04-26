package page.shellcore.tech.android.testunitarios.mockitomvp

class LoginModelImpl(private val presenter: Login.Presenter) : Login.Model {

    override fun validaUser(user: String, password: String) {
        if (user == "alberto"
            && password == "1234") {
            presenter.usuarioValido()
        } else {
            presenter.error()
        }
    }
}