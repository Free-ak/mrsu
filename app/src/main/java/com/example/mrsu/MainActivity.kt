package com.example.mrsu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import ButtonMenuActivity
import com.example.mrsu.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bindingClass: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass=ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)
        bindingClass.loginButton.setOnClickListener{
            val login = bindingClass.loginEditText.toString().trim()
            val pass = bindingClass.passwordEditText.toString().trim()
            if (login == "" || pass == "")
                Toast.makeText(this, "Не все поля заполнены", Toast.LENGTH_LONG).show()
            else {
                var intent =  Intent(applicationContext, ButtonMenuActivity::class.java)
                startActivity(intent)
            }
        }
    }
}