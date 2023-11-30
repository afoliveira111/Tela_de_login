package com.example.tela_de_login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.tela_de_login.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonEntrar.setOnClickListener {
            val username = binding.editUsername.text.toString().trim()
            val password = binding.editPassword.text.toString().trim()

            if (username.equals("user") && password.equals("pass")){
                Toast.makeText(applicationContext, "Login OK", Toast.LENGTH_SHORT).show()
                startActivity(Intent(this, LoginOK::class.java))
            }else{
                Toast.makeText(applicationContext, "Login Inválido", Toast.LENGTH_SHORT).show()
                startActivity(Intent(this, LoginErrado::class.java))
            }

            binding.editUsername.setText("")
            binding.editPassword.setText("")
        }

    }
}