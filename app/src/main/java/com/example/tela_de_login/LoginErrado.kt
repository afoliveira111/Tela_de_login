package com.example.tela_de_login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tela_de_login.databinding.ActivityLoginErradoBinding

class LoginErrado : AppCompatActivity() {

    private lateinit var binding: ActivityLoginErradoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginErradoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonVoltar.setOnClickListener {
          finish()
        }
    }
}