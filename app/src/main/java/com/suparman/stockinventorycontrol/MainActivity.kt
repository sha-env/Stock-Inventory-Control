package com.suparman.stockinventorycontrol

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Tambahkan ini untuk menangani klik tombol
        val buttonNavigate = findViewById<Button>(R.id.btn_1)
        buttonNavigate.setOnClickListener {
            navigateToLoginActivity()
        }

        // Tambahkan ini untuk menangani klik tombol Register
        val buttonRegister = findViewById<Button>(R.id.btn_2)
        buttonRegister.setOnClickListener {
            navigateToRegisterActivity()
        }
    }

    // Fungsi untuk berpindah ke SecondActivity
    private fun navigateToLoginActivity() {
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
    }

    // Fungsi untuk berpindah ke RegisterActivity
    private fun navigateToRegisterActivity() {
        val intent = Intent(this, RegisterActivity::class.java)
        startActivity(intent)
    }
}