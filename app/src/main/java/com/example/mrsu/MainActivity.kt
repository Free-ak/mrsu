package com.example.mrsu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_main)

        val userLogin: EditText = findViewById((R.id.loginEditText))
        val userPassword: EditText = findViewById(R.id.passwordEditText)
        val buttonLogin: Button = findViewById(R.id.loginButton)
        buttonLogin.setOnClickListener {
            val login = userLogin.text.toString().trim()
            val pass = userPassword.text.toString().trim()

            if (login == "" || pass == "")
                Toast.makeText(this, "Не все поля заполнены", Toast.LENGTH_LONG).show()
            else {
                val intent = Intent(this, bottom_menu::class.java)
                startActivity(intent)
            }
        }
    }
}