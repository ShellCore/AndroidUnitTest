package page.shellcore.tech.android.testunitarios.mockitomvp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*
import page.shellcore.tech.android.testunitarios.R

class LoginActivity : AppCompatActivity(), Login.View {

    private val presenter: Login.Presenter by lazy {
        LoginPresenterImpl(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    override fun usuarioValido() {
        Toast.makeText(this, "User Valid", Toast.LENGTH_SHORT)
            .show()
    }

    override fun error() {
        Log.d("TAG1", "El usuario no es válido")
    }

    override fun getUserName(): String {
        return edtUser.text.toString()
    }

    override fun getPassword(): String {
        return edtPassword.text.toString()
    }
}
