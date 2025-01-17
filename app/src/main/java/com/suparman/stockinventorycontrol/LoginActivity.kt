package com.suparman.stockinventorycontrol

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login) // Pastikan layout ini benar

        val mainView = findViewById<View>(R.id.main) // Pastikan ID ini benar
        if (mainView != null) {
            ViewCompat.setOnApplyWindowInsetsListener(mainView) { v, insets ->
                val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
                v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
                insets
            }
        } else {
            // Handle the case where the view is null
            // For example, log an error or show a message to the user
            Log.e("LoginActivity", "View with ID 'main' not found")
        }

        // Handle "Masuk" click
        val txtMasuk = findViewById<TextView>(R.id.daftar)
        txtMasuk.setOnClickListener {
            // Navigate to RegisterActivity
            navigateToRegisterActivity()
        }
    }
    // Fungsi untuk berpindah ke RegisterActivity
    private fun navigateToRegisterActivity() {
        val intent = Intent(this, RegisterActivity::class.java)
        startActivity(intent)
    }
}