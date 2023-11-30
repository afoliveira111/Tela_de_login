package com.example.tela_de_login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tela_de_login.databinding.ActivityLoginOkBinding

class LoginOK : AppCompatActivity() {

    private lateinit var binding: ActivityLoginOkBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginOkBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.buttonLogout.setOnClickListener {
            finish()
        }
    }
}