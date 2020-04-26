package page.shellcore.tech.android.testunitarios.mockitomvp

class LoginPresenterImpl(private var view: Login.View?) :
    Login.Presenter {

    private val model: Login.Model by lazy {
        LoginModelImpl(this)
    }

    override fun validateUser(user: String, password: String) {
        view?.let {
            model.validaUser(user, password)
        }
    }

    override fun usuarioValido() {
        view?.usuarioValido()
    }

    override fun error() {
        view?.error()
    }
}